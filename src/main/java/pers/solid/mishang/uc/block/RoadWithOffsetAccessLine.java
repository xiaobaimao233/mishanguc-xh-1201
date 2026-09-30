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
import net.minecraft.state.property.BooleanProperty;
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

/**
 * 类似于 {@link RoadWithStraightLine}，不过道路的直线是偏移的，而非正中的。
 */
public interface RoadWithOffsetAccessLine extends Road {
  /**
   * 道路偏移直线所偏移的反方向。例如道路有一条南北方向的向西偏移的直线，则该道路朝向东。
   */
  DirectionProperty FACING = Properties.HORIZONTAL_FACING;
  /**
   * 是否处于镜像状态（侧边线翻转，中间不变）。
   */
  BooleanProperty MIRROR = BooleanProperty.of("mirror");

  @Override
  default void appendRoadProperties(StateManager.Builder<Block, BlockState> builder) {
    Road.super.appendRoadProperties(builder);
    builder.add(FACING, MIRROR); // 注册 MIRROR 属性
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
    return Road.super.mirrorRoad(state, mirror)
            .with(FACING, mirror.apply(state.get(FACING)))
            .with(MIRROR, !state.get(MIRROR)); // 使用镜像工具时翻转 MIRROR
  }

  @Override
  default BlockState rotateRoad(BlockState state, BlockRotation rotation) {
    return Road.super.rotateRoad(state, rotation)
            .with(FACING, rotation.rotate(state.get(FACING))); // MIRROR 不随旋转改变
  }

  @Override
  default BlockState withPlacementState(BlockState state, ItemPlacementContext ctx) {
    boolean isSneaking = ctx.getPlayer() != null && ctx.getPlayer().isSneaking();
    Direction facing = isSneaking
            ? ctx.getHorizontalPlayerFacing().rotateYCounterclockwise()
            : ctx.getHorizontalPlayerFacing().rotateYClockwise();
    // 潜行放置时，赋予镜像状态
    return Road.super.withPlacementState(state, ctx)
            .with(FACING, facing)
            .with(MIRROR, isSneaking);
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

  // 接受两个模型 ID：正常模型和镜像模型
  default @NotNull BlockStateSupplier createBlockStates(Block block, Identifier modelId, Identifier mirroredModelId) {
    return VariantsBlockStateSupplier.create(block)
            .coordinate(BlockStateVariantMap.create(FACING, MIRROR).register((direction, mirror) -> {
              BlockStateVariant variant = BlockStateVariant.create()
                      .put(VariantSettings.MODEL, mirror ? mirroredModelId : modelId) // 根据 MIRROR 选择模型
                      .put(VariantSettings.UVLOCK, false)
                      .put(MishangUtils.DIRECTION_Y_VARIANT, direction.rotateYClockwise());
              return variant;
            }));
  }

  @Contract(pure = true)
  int offsetLevel();

  class Impl extends AbstractRoadBlock implements RoadWithOffsetAccessLine {
    private final String lineTexture;
    private final int offsetLevel;

    public Impl(Settings settings, LineColor lineColor, LineType lineType, String lineTexture, int offsetLevel) {
      super(settings, lineColor, lineType);
      this.lineTexture = lineTexture;
      this.offsetLevel = offsetLevel;
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
      // 1. 正常状态材质
      final FasterTextureMap textures = new FasterTextureMap()
              .base("asphalt")
              .lineTop("white_straight_edge_line")                 // 顶面：中间对称直线
              .lineTop2("white_offset_straight_access_end_side_line") // 顶面：左侧折线
              .lineSide("white_straight_edge_line")                  // 侧面：常规边线
              .lineSide2("white_straight_edge_line")
              .varP(MishangucTextureKeys.LINE_SIDE3, "white_offset_straight_access_mid_line"); // 侧面3：改名后的正常包边

      // 2. 镜像状态材质（必须全部换成对应的镜像贴图，不能有遗漏）
      final FasterTextureMap mirroredTextures = new FasterTextureMap()
              .base("asphalt")
              .lineTop("white_straight_edge_line")
              .lineTop2("white_offset_straight_access_end_side_line_mirrored") // 顶面：右侧折线（镜像）
              .lineSide("white_straight_edge_line")
              .lineSide2("white_straight_edge_line")
              .varP(MishangucTextureKeys.LINE_SIDE3, "white_offset_straight_access_mid_line_mirrored"); // 侧面3：改名后的镜像包边

      // 3. 生成正常模型
      final Identifier modelId = road.uploadModel(
              "_with_straight_and_angle_line",
              textures,
              blockStateModelGenerator,
              MishangucTextureKeys.BASE,
              MishangucTextureKeys.LINE_TOP,
              MishangucTextureKeys.LINE_TOP2,
              MishangucTextureKeys.LINE_SIDE,
              MishangucTextureKeys.LINE_SIDE2,
              MishangucTextureKeys.LINE_SIDE3
      );

      // 4. 生成镜像模型
      final Identifier mirroredModelId = road.uploadModel(
              "_with_straight_and_angle_line_mirrored",
              "_mirrored",
              mirroredTextures,
              blockStateModelGenerator,
              MishangucTextureKeys.BASE,
              MishangucTextureKeys.LINE_TOP,
              MishangucTextureKeys.LINE_TOP2,
              MishangucTextureKeys.LINE_SIDE,
              MishangucTextureKeys.LINE_SIDE2,
              MishangucTextureKeys.LINE_SIDE3
      );

      // 5. 提交
      blockStateModelGenerator.blockStateCollector.accept(road.composeState(createBlockStates(road, modelId, mirroredModelId)));
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