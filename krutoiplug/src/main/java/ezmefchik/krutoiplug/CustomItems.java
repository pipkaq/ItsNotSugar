package ezmefchik.krutoiplug;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomItems {
    public static ItemStack MagicMef;
    public static ItemStack LeftMef;
    public static ItemStack RightMef;

    public static void Init() {
        MagicMef = MagicMef();
        LeftMef = LeftMef();
        RightMef = RightMef();
    }
    private static ItemStack MagicMef() {
        ItemStack item = new ItemStack(Material.SUGAR);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§dMephedrone 10%");

        meta.setMaxStackSize(1);

        List<String> lore = new ArrayList<>();

        meta.setLore(Collections.singletonList("§c§lBad Brewed Mephedrone!"));
        meta.setLore(Collections.singletonList("§7Press ▮▯[RBM] to snort. Mephedrone."));

        item.setItemMeta(meta);

        return item;}

    private static ItemStack LeftMef() {
        ItemStack item = new ItemStack(Material.SUGAR);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§dMephedrone 50%");

        meta.setMaxStackSize(1);

        meta.setLore(Collections.singletonList("§c§lIt's not the best, but it's something.!"));
        meta.setLore(Collections.singletonList("§7Press ▮▯[RBM] to snort. Mephedrone."));

        item.setItemMeta(meta);

        return item;
    }
    private static ItemStack RightMef() {
        ItemStack item = new ItemStack(Material.SUGAR);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§dMephedrone 100%");

        meta.setMaxStackSize(1);


        List<String> lore = new ArrayList<>();

        lore.add("§c§lThe best of the lot.!");
        lore.add("§7Press ▮▯[RBM] to snort. Mephedrone.");

        meta.addEnchant((Enchantment.INFINITY), 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        item.setItemMeta(meta);

        return item;
}}

