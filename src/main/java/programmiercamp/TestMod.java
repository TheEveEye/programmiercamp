package programmiercamp;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Material;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.BlockSoundGroup;

import programmiercamp.registry.Mod;
import programmiercamp.registry.ModBlocks;

public class TestMod implements ModInitializer {

    public static final String MOD_ID = "test_mod";

    public static final ItemGroup GRUPPE = Mod.GruppeErstellen("test_mod", MOD_ID);

    @Override
    public void onInitialize() {
        Mod.ItemHinzufuegen("rubin",GRUPPE, MOD_ID);
        Mod.ItemHinzufuegen("citrine", GRUPPE, MOD_ID);
        Mod.ItemHinzufuegen("raw_citrine", GRUPPE, MOD_ID);

        Mod.BlockHinzufuegen("rubin_block", Material.METAL, 4, 2, BlockSoundGroup.METAL, ModBlocks.WerkzeugArt.SPITZHACKE, 0, 20, GRUPPE, MOD_ID);

        Mod.BlockHinzufuegen("rubin_erz", Material.STONE, 4, 10, BlockSoundGroup.STONE, ModBlocks.WerkzeugArt.SPITZHACKE, 2, 40, GRUPPE, MOD_ID);

        Mod.BlockHinzufuegen("citrine_block", Material.METAL, 4, 2, BlockSoundGroup.METAL, ModBlocks.WerkzeugArt.SPITZHACKE, 0, 20, GRUPPE, MOD_ID);
        Mod.BlockHinzufuegen("citrine_ore", Material.STONE, 4, 10, BlockSoundGroup.STONE, ModBlocks.WerkzeugArt.SPITZHACKE, 0, 40, GRUPPE, MOD_ID);
        Mod.BlockHinzufuegen("deepslate_citrine_ore", Material.STONE, 4, 10, BlockSoundGroup.STONE, ModBlocks.WerkzeugArt.SPITZHACKE, 0, 80, GRUPPE, MOD_ID);

        Mod.SpitzhackeHinzufuegen("rubin_spitzhacke", new RubinMaterial(), 8, 1.0f, GRUPPE, MOD_ID);
        Mod.FeldhackeHinzufuegen("rubin_feldhacke", new RubinMaterial(), 8, 1.0f, GRUPPE, MOD_ID);
        Mod.SchaufelHinzufuegen("rubin_schaufel", new RubinMaterial(), 8, 1.0f, GRUPPE, MOD_ID);
        Mod.AxtHinzufuegen("rubin_axt", new RubinMaterial(), 8, 1.0f, GRUPPE, MOD_ID);
        Mod.SchwertHinzufuegen("rubin_schwert", new RubinMaterial(), 8, 1.0f, GRUPPE, MOD_ID);

        Mod.BlockHinzufuegen("citrine_stairs", Material.METAL, 4, 2, BlockSoundGroup.METAL, ModBlocks.WerkzeugArt.SPITZHACKE, 0, 20, GRUPPE, MOD_ID);


        //Ab hier beginnen die Drogen

        Mod.ItemHinzufuegen("phenylacetone", GRUPPE, MOD_ID); // Phenylacetone
        Mod.ItemHinzufuegen("phenlyananin_tablets", GRUPPE, MOD_ID);
    }
}
