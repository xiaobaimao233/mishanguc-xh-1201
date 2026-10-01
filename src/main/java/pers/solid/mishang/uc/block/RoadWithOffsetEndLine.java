package pers.solid.mishang.uc.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.data.client.*;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pers.solid.mishang.uc.MishangUtils;
import pers.solid.mishang.uc.data.FasterTextureMap;
import pers.solid.mishang.uc.data.MishangucTextureKeys;
import pers.solid.mishang.uc.util.*;

import java.util.List;

public interface RoadWithOffsetEndLine extends Road {
  DirectionProperty FACING = Properties.HORIZONTAL_FACING;

  @Override
  default void appendRoadProperties(StateManager.Builder<Block, BlockState> builder) {
    Road.super.appendRoadProperties(builder);
    builder.add(FACING);
  }

  @Override
  default RoadConnectionState getConnectionStateOf(BlockState state, Direction direction) {
    return RoadConnectionState.or(
            Road.super.getConnectionStateOf(state, direction),
            RoadConnectionState.of(
                    direction.getAxis() != state.get(FACING).getAxis(),
                    getLineColor(state, direction),
                    EightHorizontalDirection.of(direction),
                    getLineType(state, direction),
                    new LineOffset(state.get(FACING).getOpposite(), offsetLevel())));
  }

  @Override
  default BlockState mirrorRoad(BlockState state, BlockMirror mirror) {
    return Road.super.mirrorRoad(state, mirror).with(FACING, mirror.apply(state.get(FACING)));
  }

  @Override
  default BlockState rotateRoad(BlockState state, BlockRotation rotation) {
    return Road.super.rotateRoad(state, rotation).with(FACING, rotation.rotate(state.get(FACING)));
  }

  @Override
  default BlockState withPlacementState(BlockState state, ItemPlacementContext ctx) {
    return Road.super
            .withPlacementState(state, ctx)
            .with(
                    FACING,
                    ctx.getPlayer() != null && ctx.getPlayer().isSneaking()
                            ? ctx.getHorizontalPlayerFacing().rotateYCounterclockwise()
                            : ctx.getHorizontalPlayerFacing().rotateYClockwise());
  }

  @Override
  default void appendRoadTooltip(
          ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
    Road.super.appendRoadTooltip(stack, world, tooltip, options);
    final int offsetLevel = offsetLevel();
    if (offsetLevel == 114514) {
      tooltip.add(TextBridge.translatable("block.mishanguc.tooltip.road_with_white_and_yellow_double_line.1").formatted(Formatting.GRAY));
      tooltip.add(TextBridge.translatable("block.mishanguc.tooltip.road_with_white_and_yellow_double_line.2").formatted(Formatting.GRAY));
      tooltip.add(TextBridge.translatable("block.mishanguc.tooltip.road_with_white_and_yellow_double_line.3").formatted(Formatting.GRAY));
    } else {
      tooltip.add(
              TextBridge.translatable("block.mishanguc.tooltip.road_with_offset_straight_line")
                      .formatted(Formatting.GRAY));
    }
  }

  default @NotNull BlockStateSupplier createBlockStates(Block block, Identifier modelId) {
    return VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, modelId).put(VariantSettings.UVLOCK, false)).coordinate(BlockStateVariantMap.create(FACING).register(direction -> BlockStateVariant.create().put(MishangUtils.DIRECTION_Y_VARIANT, direction.rotateYClockwise())));
  }

  @Contract(pure = true)
  int offsetLevel();

  class Impl extends AbstractRoadBlock implements RoadWithOffsetEndLine {
    private final String lineTexture;
    private final String sideTexture;
    private final int offsetLevel;
    /** true = 南面有线，false = 北面有线 */
    private final boolean southFace;

    public Impl(Settings settings, LineColor lineColor, LineType lineType, String lineTexture, String sideTexture, int offsetLevel, boolean southFace) {
      super(settings, lineColor, lineType);
      this.lineTexture = lineTexture;
      this.sideTexture = sideTexture;
      this.offsetLevel = offsetLevel;
      this.southFace = southFace;
    }

    @Override
    public void appendDescriptionTooltip(List<Text> tooltip, TooltipContext options) {
      if (offsetLevel == 0) {
        tooltip.add(TextBridge.translatable("tbd")
                .formatted(Formatting.BLUE));
      } else {
        tooltip.add(TextBridge.translatable("lineType.offsetStraight.composed", lineColor.getName(), lineType.getName()).formatted(Formatting.BLUE));
      }
    }

    @Override
    protected <B extends Block & Road> void registerBaseOrSlabModels(B road, BlockStateModelGenerator blockStateModelGenerator) {
      final FasterTextureMap textures = new FasterTextureMap()
              .base("asphalt")
              .lineSide(sideTexture)
              .lineTop(lineTexture);

      // 根据 southFace 选择不同的父模型后缀
      final String suffix = southFace ? "_with_offset_end_line_south" : "_with_offset_end_line_north";

      final Identifier modelId = road.uploadModel(
              suffix,
              textures,
              blockStateModelGenerator,
              MishangucTextureKeys.BASE,
              MishangucTextureKeys.LINE_SIDE,
              MishangucTextureKeys.LINE_TOP
      );

      blockStateModelGenerator.blockStateCollector.accept(road.composeState(createBlockStates(road, modelId)));
    }

    @Override
    public CraftingRecipeJsonBuilder getPaintingRecipe(Block base, Block self) {
      if (offsetLevel == 114514) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, self, 3)
                .pattern("w y")
                .pattern("XXX")
                .pattern("w y")
                .input('w', LineColor.WHITE.getIngredient())
                .input('y', LineColor.YELLOW.getIngredient())
                .input('X', base)
                .criterion("has_white_paint", RecipeProvider.conditionsFromTag(LineColor.WHITE.getIngredient()))
                .criterion("has_yellow_paint", RecipeProvider.conditionsFromTag(LineColor.YELLOW.getIngredient()))
                .criterion(RecipeProvider.hasItem(base), RecipeProvider.conditionsFromItem(base));
      } else {
        final String[] patterns = switch (offsetLevel) {
          case 2 -> new String[]{
                  "*  ",
                  "XXX",
                  "*  "
          };
          case 1 -> new String[]{
                  "*  ",
                  "XXX",
                  " * "
          };
          default -> throw new IllegalStateException("Unexpected value: " + offsetLevel);
        };
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, self, 3)
                .pattern(patterns[0])
                .pattern(patterns[1])
                .pattern(patterns[2])
                .input('*', lineColor.getIngredient())
                .input('X', base)
                .criterion("has_paint", RecipeProvider.conditionsFromTag(lineColor.getIngredient()))
                .criterion(RecipeProvider.hasItem(base), RecipeProvider.conditionsFromItem(base));
      }
    }

    @Override
    public int offsetLevel() {
      return offsetLevel;
    }
  }
}