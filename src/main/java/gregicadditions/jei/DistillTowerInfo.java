package gregicadditions.jei;

import com.google.common.collect.Lists;
import gregicadditions.machines.GATileEntities;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.integration.jei.multiblock.MultiblockInfoPage;
import gregtech.integration.jei.multiblock.MultiblockShapeInfo;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;

import java.util.List;

public class DistillTowerInfo extends MultiblockInfoPage {

    @Override
    public MultiblockControllerBase getController() {
        return GATileEntities.DISTILL_TOWER;
    }

    @Override
    public List<MultiblockShapeInfo> getMatchingShapes() {
        MultiblockShapeInfo max = MultiblockShapeInfo.builder()
                .aisle("XSX", "XXX", "XXX", "XNX", "XXX", "XXX", "XXX", "XNX", "XXX", "XXX", "XXX", "XNX")
                .aisle("XFB", "X#X", "W#X", "X#X", "X#G", "X#X", "W#X", "X#X", "X#G", "X#X", "W#X", "XXX")
                .aisle("XEX", "XHX", "XXX", "XXX", "XXX", "XHX", "XXX", "XXX", "XXX", "XHX", "XXX", "XXX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();

        MultiblockShapeInfo gigantic = MultiblockShapeInfo.builder()
                .aisle("XSX", "XXX", "XXX", "XNX", "XXX", "XXX", "XXX", "XNX", "XXX", "XXX", "XXX")
                .aisle("XFB", "X#X", "W#X", "X#X", "X#G", "X#X", "W#X", "X#X", "X#G", "X#X", "WXX")
                .aisle("XEX", "XHX", "XXX", "XXX", "XXX", "XHX", "XXX", "XXX", "XXX", "XHX", "XXX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();

        MultiblockShapeInfo enormous = MultiblockShapeInfo.builder()
                .aisle("XSX", "XXX", "XXX", "XNX", "XXX", "XXX", "XXX", "XNX", "XXX", "XXX")
                .aisle("XFB", "X#X", "W#X", "X#X", "X#G", "X#X", "W#X", "X#X", "X#G", "XXX")
                .aisle("XEX", "XHX", "XXX", "XXX", "XXX", "XHX", "XXX", "XXX", "XXX", "XHX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();

        MultiblockShapeInfo huge = MultiblockShapeInfo.builder()
                .aisle("XSX", "XXX", "XXX", "XNX", "XXX", "XXX", "XXX", "XNX", "XXX")
                .aisle("XFB", "X#X", "W#X", "X#X", "X#G", "X#X", "W#X", "X#X", "XXG")
                .aisle("XEX", "XHX", "XXX", "XXX", "XXX", "XHX", "XXX", "XXX", "XXX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();

        MultiblockShapeInfo large = MultiblockShapeInfo.builder()
                .aisle("XSX", "XXX", "XXX", "XNX", "XXX", "XXX", "XXX", "XNX")
                .aisle("XFB", "X#X", "W#X", "X#X", "X#G", "X#X", "W#X", "XXX")
                .aisle("XEX", "XHX", "XXX", "XXX", "XXX", "XHX", "XXX", "XXX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();

        MultiblockShapeInfo big = MultiblockShapeInfo.builder()
                .aisle("XSX", "XXX", "XXX", "XNX", "XXX", "XXX", "XXX")
                .aisle("XFB", "X#X", "W#X", "X#X", "X#G", "X#X", "WXX")
                .aisle("XEX", "XHX", "XXX", "XXX", "XXX", "XHX", "XXX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();

        MultiblockShapeInfo normal = MultiblockShapeInfo.builder()
                .aisle("XSX", "XXX", "XXX", "XNX", "XXX", "XXX")
                .aisle("XFB", "X#X", "W#X", "X#X", "X#G", "XXX")
                .aisle("XEX", "XHX", "XXX", "XXX", "XXX", "XHX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();

        MultiblockShapeInfo small = MultiblockShapeInfo.builder()
                .aisle("XSX", "XXX", "XXX", "XNX", "XXX")
                .aisle("XFB", "X#X", "W#X", "X#X", "XXG")
                .aisle("XEX", "XHX", "XXX", "XXX", "XXX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();

        MultiblockShapeInfo tiny = MultiblockShapeInfo.builder()
                .aisle("XSX", "XXX", "XXX", "XNX")
                .aisle("XFB", "X#X", "W#X", "XXX")
                .aisle("XEX", "XHX", "XXX", "XXX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();

        MultiblockShapeInfo tinier = MultiblockShapeInfo.builder()
                .aisle("XSX", "XXX", "XXX")
                .aisle("XFB", "X#X", "WXX")
                .aisle("XEX", "XHX", "XXX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();

        MultiblockShapeInfo tiniest = MultiblockShapeInfo.builder()
                .aisle("XSX", "XNX")
                .aisle("XFB", "XXX")
                .aisle("XEX", "XXX")
                .where('X', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN))
                .where('S', GATileEntities.DISTILL_TOWER, EnumFacing.NORTH)
                .where('#', Blocks.AIR.getDefaultState())
                .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV], EnumFacing.DOWN)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('H', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.SOUTH)
                .where('G', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.EAST)
                .where('N', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.NORTH)
                .where('W', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV], EnumFacing.WEST)
                .where('B', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV], EnumFacing.EAST)
                .build();
        return Lists.newArrayList(tiniest, tinier, tiny, small, normal, big, large, huge, enormous, gigantic, max);
    }

    @Override
    public String[] getDescription() {
        return new String[]{I18n.format("gregtech.multiblock.distill_tower.description")};
    }

}