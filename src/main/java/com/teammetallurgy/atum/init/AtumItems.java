package com.teammetallurgy.atum.init;

import com.teammetallurgy.atum.blocks.BlockAtumPlank;
import com.teammetallurgy.atum.items.*;
import com.teammetallurgy.atum.items.artifacts.*;
import com.teammetallurgy.atum.items.artifacts.atum.*;
import com.teammetallurgy.atum.items.artifacts.geb.ItemGebsGrounding;
import com.teammetallurgy.atum.items.artifacts.geb.ItemGebsToil;
import com.teammetallurgy.atum.items.artifacts.isis.ItemIsisHealing;
import com.teammetallurgy.atum.items.artifacts.montu.ItemMontusBlast;
import com.teammetallurgy.atum.items.artifacts.nuit.ItemNuitsDuality;
import com.teammetallurgy.atum.items.artifacts.ptah.ItemPtahsDecadence;
import com.teammetallurgy.atum.items.artifacts.ptah.ItemPtahsUndoing;
import com.teammetallurgy.atum.items.artifacts.ra.*;
import com.teammetallurgy.atum.items.artifacts.tefnut.ItemTefnutsBlessing;
import com.teammetallurgy.atum.items.tools.*;
import com.teammetallurgy.atum.utils.Constants;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.teammetallurgy.atum.utils.AtumRegistry.registerItem;

@GameRegistry.ObjectHolder(value = Constants.MOD_ID)
public class AtumItems {
    //TODO Move ArmorMaterials to somewhere else
    private static final ArmorMaterial MUMMY_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("MUMMY", "mummy", 5, new int[]{2, 3, 2, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    private static final ArmorMaterial WANDERER_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("WANDERER", "wanderer", 10, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    private static final ArmorMaterial DESERT_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("DESERT", "desert", 20, new int[]{3, 6, 5, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);

    public static final Item DIRTY_COIN = new ItemCoin();
    public static final Item GOLD_COIN = new ItemCoin();
    public static final Item SCRAP = new Item();
    public static final Item LINEN = new Item();
    public static final Item SCARAB = new ItemScarab();
    public static final Item FERTILE_SOIL_PILE = new Item();
    public static final Item DATE = new ItemFood(4, 0.3F, false);
    public static final Item GOLDEN_DATE = new ItemDateGold(5, 1.5F, false).setAlwaysEdible();
    public static final Item ENCHANTED_GOLDEN_DATE = new ItemDateGoldEnchanted(5, 1.5F, false).setAlwaysEdible();
    public static final Item SCIMITAR = new ItemSword(ToolMaterial.IRON);
    public static final Item GREATSWORD = new ItemGreatsword(ToolMaterial.IRON);
    public static final Item SHORT_BOW = new ItemBaseBow();
    public static final Item STONEGUARD_SWORD = new ItemSword(ToolMaterial.IRON);
    public static final Item BRIGAND_SHIELD = new ItemAtumShield().setRepairItem(Items.IRON_INGOT).setMaxDamage(150);
    public static final Item SCEPTER = new ItemSword(ToolMaterial.GOLD);
    public static final Item SOBEKS_RAGE = new ItemSobeksRage(ToolMaterial.DIAMOND);
    public static final Item EYES_OF_ATUM = new ItemEyesOfAtum();
    public static final Item BODY_OF_ATUM = new ItemBodyOfAtum();
    public static final Item LEGS_OF_ATUM = new ItemLegsOfAtum();
    public static final Item FEET_OF_ATUM = new ItemFeetOfAtum();
    public static final Item ATUMS_WILL = new ItemAtumsWill();
    public static final Item ATUMS_PROTECTION = new ItemAtumsProtection();
    public static final Item ATUMS_BOUNTY = new ItemAtumsBounty();
    public static final Item ATUMS_HOMECOMING = new ItemAtumsHomecoming();
    public static final Item MONTHUS_STRIKE = new ItemMonthusStrike(ToolMaterial.DIAMOND);
    public static final Item ANHURS_MIGHT = new ItemAnhursMight(ToolMaterial.DIAMOND);
    public static final Item HEDETETS_STING = new ItemHedetetsSting(ToolMaterial.DIAMOND);
    public static final Item HORUS_SOARING = new ItemHorusSoaring();
    public static final Item SHUS_BREATH = new ItemShusBreath();
    public static final Item MONTUS_BLAST = new ItemMontusBlast();
    public static final Item NUS_FLUX = new ItemNusFlux(ToolMaterial.DIAMOND);
    public static final Item HALO_OF_RA = new ItemHaloOfRa();
    public static final Item BODY_OF_RA = new ItemBodyOfRa();
    public static final Item LEGS_OF_RA = new ItemLegsOfRa();
    public static final Item FEET_OF_RA = new ItemFeetOfRa();
    public static final Item RAS_FURY = new ItemRasFury();
    public static final Item PTAHS_DECADENCE = new ItemPtahsDecadence();
    public static final Item PTAHS_UNDOING = new ItemPtahsUndoing();
    public static final Item GEBS_TOIL = new ItemGebsToil();
    public static final Item GEBS_GROUNDING = new ItemGebsGrounding();
    public static final Item TEFNUTS_BLESSING = new ItemTefnutsBlessing();
    public static final Item HEDETETS_VENOM = new ItemHedetetsVenom();
    public static final Item NUTS_CALL = new ItemNutsCall();
    public static final Item MAFDETS_QUICKNESS = new ItemMafdetsQuickness();
    public static final Item ISIS_HEALING = new ItemIsisHealing();
    public static final Item ANUBIS_MERCY = new ItemAnubisMercy();
    public static final Item LIMESTONE_SHOVEL = new ItemLimestoneShovel(ToolMaterial.STONE);
    public static final Item LIMESTONE_PICKAXE = new ItemLimestonePickaxe(ToolMaterial.STONE);
    public static final Item LIMESTONE_AXE = new ItemLimestoneAxe(ToolMaterial.STONE);
    public static final Item LIMESTONE_SWORD = new ItemLimestoneSword(ToolMaterial.STONE);
    public static final Item LIMESTONE_HOE = new ItemLimestoneHoe(ToolMaterial.STONE);
    public static final Item MUMMY_HELMET = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setRepairItem(SCRAP).setTextureFile("mummy_armor_1");
    public static final Item MUMMY_CHEST = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setRepairItem(SCRAP).setTextureFile("mummy_armor_1");
    public static final Item MUMMY_LEGS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setRepairItem(SCRAP).setTextureFile("mummy_armor_2");
    public static final Item MUMMY_BOOTS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setRepairItem(SCRAP).setTextureFile("mummy_armor_1");
    public static final Item WANDERER_HELMET = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setRepairItem(LINEN).setTextureFile("wanderer_armor_1");
    public static final Item WANDERER_CHEST = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setRepairItem(LINEN).setTextureFile("wanderer_armor_1");
    public static final Item WANDERER_LEGS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setRepairItem(LINEN).setTextureFile("wanderer_armor_2");
    public static final Item WANDERER_BOOTS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setRepairItem(LINEN).setTextureFile("wanderer_armor_1");
    public static final Item DESERT_HELMET = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setRepairItem(Items.IRON_INGOT).setTextureFile("desert_armor_1");
    public static final Item DESERT_CHEST = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setRepairItem(Items.IRON_INGOT).setTextureFile("desert_armor_1");
    public static final Item DESERT_LEGS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setRepairItem(Items.IRON_INGOT).setTextureFile("desert_armor_2");
    public static final Item DESERT_BOOTS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setRepairItem(Items.IRON_INGOT).setTextureFile("desert_armor_1");
    public static final Item PAPYRUS_PLANT = new ItemBlockSpecial(AtumBlocks.PAPYRUS);
    public static final Item ECTOPLASM = new Item();
    public static final Item MANDIBLES = new Item();
    public static final Item DUSTY_BONE = new Item();
    public static final Item STONE_CHUNK = new Item();
    public static final Item SCROLL = new Item();
    public static final Item WOLF_PELT = new Item();
    public static final Item FLAX = new Item();
    public static final Item FLAX_SEED = new ItemSeeds(AtumBlocks.FLAX, Blocks.FARMLAND);
    public static final Item FORSAKEN_FISH = new ItemFish(ItemFish.FishType.FORSAKEN);
    public static final Item MUMMIFIED_FISH = new ItemFish(ItemFish.FishType.MUMMIFIED);
    public static final Item JEWELED_FISH = new ItemFish(ItemFish.FishType.JEWELED);
    public static final Item SKELETAL = new ItemFish(ItemFish.FishType.SKELETAL);
    public static final Item NUITS_DUALITY = new ItemNuitsDuality();
    public static final Item DEADWOOD_BEETLE = new ItemDeadwoodBeetle();

    public static void registerItems() {
        BlockAtumPlank.registerSticks();
        registerItem(DIRTY_COIN, "coin_dirty");
        registerItem(GOLD_COIN, "coin_gold");
        ItemLoot.createLootItems();
        registerItem(SCRAP, "cloth_scrap");
        registerItem(LINEN, "linen");
        registerItem(SCARAB, "scarab");
        registerItem(DATE, "date");
        registerItem(GOLDEN_DATE, "golden_date");
        registerItem(ENCHANTED_GOLDEN_DATE, "golden_date_enchanted");
        registerItem(SCIMITAR, "scimitar");
        registerItem(GREATSWORD, "greatsword");
        registerItem(SHORT_BOW, "short_bow");
        registerItem(STONEGUARD_SWORD, "stoneguard_sword");
        registerItem(BRIGAND_SHIELD, "brigand_shield");
        registerItem(SCEPTER, "scepter");
        registerItem(SOBEKS_RAGE, "sobeks_rage");
        registerItem(EYES_OF_ATUM, "eyes_of_atum");
        registerItem(BODY_OF_ATUM, "body_of_atum");
        registerItem(LEGS_OF_ATUM, "legs_of_atum");
        registerItem(FEET_OF_ATUM, "feet_of_atum");
        registerItem(ATUMS_WILL, "atums_will");
        registerItem(ATUMS_PROTECTION, "atums_protection");
        registerItem(ATUMS_BOUNTY, "atums_bounty");
        registerItem(ATUMS_HOMECOMING, "atums_homecoming");
        registerItem(MONTHUS_STRIKE, "monthus_strike");
        registerItem(ANHURS_MIGHT, "anhurs_might");
        registerItem(HEDETETS_STING, "hedetets_sting");
        registerItem(HORUS_SOARING, "horus_soaring");
        registerItem(SHUS_BREATH, "shus_breath");
        registerItem(MONTUS_BLAST, "montus_blast");
        registerItem(NUS_FLUX, "nus_flux");
        registerItem(HALO_OF_RA, "halo_of_ra");
        registerItem(BODY_OF_RA, "body_of_ra");
        registerItem(LEGS_OF_RA, "legs_of_ra");
        registerItem(FEET_OF_RA, "feet_of_ra");
        registerItem(RAS_FURY, "ras_fury");
        registerItem(PTAHS_DECADENCE, "ptahs_decadence");
        registerItem(PTAHS_UNDOING, "ptahs_undoing");
        registerItem(GEBS_TOIL, "gebs_toil");
        registerItem(GEBS_GROUNDING, "gebs_grounding");
        registerItem(TEFNUTS_BLESSING, "tefnuts_blessing");
        registerItem(HEDETETS_VENOM, "hedetets_venom");
        registerItem(NUTS_CALL, "nuts_call");
        registerItem(MAFDETS_QUICKNESS, "mafdets_quickness");
        registerItem(ISIS_HEALING, "isis_healing");
        registerItem(ANUBIS_MERCY, "anubiss_mercy");
        registerItem(LIMESTONE_SHOVEL, "limestone_shovel");
        registerItem(LIMESTONE_PICKAXE, "limestone_pickaxe");
        registerItem(LIMESTONE_AXE, "limestone_axe");
        registerItem(LIMESTONE_SWORD, "limestone_sword");
        registerItem(LIMESTONE_HOE, "limestone_hoe");
        registerItem(MUMMY_HELMET, "mummy_helmet");
        registerItem(MUMMY_CHEST, "mummy_chest");
        registerItem(MUMMY_LEGS, "mummy_legs");
        registerItem(MUMMY_BOOTS, "mummy_boots");
        registerItem(WANDERER_HELMET, "wanderer_helmet");
        registerItem(WANDERER_CHEST, "wanderer_chest");
        registerItem(WANDERER_LEGS, "wanderer_legs");
        registerItem(WANDERER_BOOTS, "wanderer_boots");
        registerItem(DESERT_HELMET, "desert_helmet");
        registerItem(DESERT_CHEST, "desert_chest");
        registerItem(DESERT_LEGS, "desert_legs");
        registerItem(DESERT_BOOTS, "desert_boots");
        registerItem(PAPYRUS_PLANT, "papyrus_plant");
        registerItem(ECTOPLASM, "ectoplasm");
        registerItem(MANDIBLES, "mandibles");
        registerItem(DUSTY_BONE, "dusty_bone", "bone");
        registerItem(STONE_CHUNK, "stone_chunk");
        registerItem(SCROLL, "scroll");
        registerItem(WOLF_PELT, "wolf_pelt");
        registerItem(FERTILE_SOIL_PILE, "fertile_soil_pile");
        registerItem(FLAX, "flax");
        registerItem(FLAX_SEED, "flax_seeds");
        registerItem(FORSAKEN_FISH, "fish_forsaken");
        registerItem(MUMMIFIED_FISH, "fish_mummified");
        registerItem(JEWELED_FISH, "fish_jeweled");
        registerItem(SKELETAL, "fish_skeletal");
        registerItem(NUITS_DUALITY, "nuits_duality");
        registerItem(DEADWOOD_BEETLE, "deadwood_beetle");
    }
}