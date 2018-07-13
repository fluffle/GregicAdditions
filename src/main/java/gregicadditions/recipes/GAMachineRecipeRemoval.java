package gregicadditions.recipes;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.type.IngotMaterial;
import gregtech.api.unification.material.type.Material;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GAMachineRecipeRemoval {

    public static void postInit() {
        for (Material m : IngotMaterial.MATERIAL_REGISTRY) {

            //Foil recipes
            removeRecipesByInputs(RecipeMaps.BENDER_RECIPES,
                    OreDictUnifier.get(OrePrefix.plate, m),
                    IntCircuitIngredient.getIntegratedCircuit(0));
            //Remove Old Rotor Recipe
            if (!OreDictUnifier.get(OrePrefix.rotor,m).isEmpty())
                removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                        OreDictUnifier.get(OrePrefix.plate,m,4),
                        OreDictUnifier.get(OrePrefix.ring,m));
        }
        //Remove Old Bucket Recipe
        removeRecipesByInputs(RecipeMaps.BENDER_RECIPES,
                OreDictUnifier.get(OrePrefix.plate,Materials.Iron,12),
                IntCircuitIngredient.getIntegratedCircuit(1));
        removeRecipesByInputs(RecipeMaps.BENDER_RECIPES,
                OreDictUnifier.get(OrePrefix.plate,Materials.WroughtIron,12),
                IntCircuitIngredient.getIntegratedCircuit(1));
        //Fix Brick Exploit
        removeRecipesByInputs(RecipeMaps.MACERATOR_RECIPES,new ItemStack(Items.BRICK));
    }

    private static void removeRecipesByInputs(RecipeMap map, ItemStack... itemInputs) {
        List<ItemStack> inputs = new ArrayList<>();
        for (ItemStack s : itemInputs)
            inputs.add(s);
        map.removeRecipe(map.findRecipe(Integer.MAX_VALUE, inputs, Collections.EMPTY_LIST));
    }
}