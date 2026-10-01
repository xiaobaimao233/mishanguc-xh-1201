package pers.solid.mishang.uc.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import pers.solid.mishang.uc.MishangUtils;
import pers.solid.mishang.uc.data.FasterTextureMap;
import pers.solid.mishang.uc.data.MishangucTextureKeys;
import pers.solid.mishang.uc.util.*;

import java.util.List;

public interface RoadWithCrossLine extends Road {
  @Override
  default RoadConnectionState getConnectionStateOf(BlockState state, Direction direction) {
    return Road.super
            .getConnectionStateOf(state, direction)
            .or(new RoadConnectionState(RoadConnectionState.WhetherConnected.CONNECTED, getLineColor(state, direction), EightHorizontalDirection.of(direction), LineType.NORMAL));
  }

  class Impl extends AbstractRoadBlock implements RoadWithCrossLine {
    public Impl(Settings settings, LineColor lineColor) {
      this(settings, lineColor, LineType.NORMAL);
    }

    public Impl(Settings settings, LineColor lineColor, LineType lineType) {
      super(settings, lineColor, lineType);
    }

    @Override
    public void appendDescriptionTooltip(List<Text> tooltip, TooltipContext options) {
      tooltip.add(TextBridge.translatable("lineType.cross.composed", lineColor.getName(), lineType.getName()).formatted(Formatting.BLUE));
    }

    @Override
    protected <B extends Block & Road> void registerBaseOrSlabModels(B road, BlockStateModelGenerator blockStateModelGenerator) {
      final String crossTexture = lineType == LineType.NORMAL
              ? lineColor.asString() + "_cross_line"
              : lineColor.asString() + "_cross_" + lineType.asString() + "_line";

      final FasterTextureMap textures = new FasterTextureMap().base("asphalt")
              .lineSide(MishangUtils.composeStraightLineTexture(lineColor, lineType))
              .lineTop(crossTexture);
      final Identifier modelId = road.uploadModel("_with_cross_line", textures, blockStateModelGenerator, MishangucTextureKeys.BASE, MishangucTextureKeys.LINE_SIDE, MishangucTextureKeys.LINE_TOP);
      blockStateModelGenerator.blockStateCollector.accept(road.composeState(BlockStateModelGenerator.createBlockStateWithRandomHorizontalRotations(road, modelId)));
    }

    @Override
    public CraftingRecipeJsonBuilder getPaintingRecipe(Block base, Block self) {
      return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, self, 4)
              .pattern("*X*")
              .pattern("X*X")
              .pattern("*X*")
              .input('*', lineColor.getIngredient())
              .input('X', base)
              .criterion("has_ingredient", RecipeProvider.conditionsFromTag(lineColor.getIngredient()))
              .criterion(RecipeProvider.hasItem(base), RecipeProvider.conditionsFromItem(base));
    }
  }
}