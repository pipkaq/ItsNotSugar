package Listeners;

import ezmefchik.krutoiplug.CustomItems;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.net.http.WebSocket;
import java.util.Arrays;
import java.util.List;

public class MefEat implements WebSocket.Listener, @NotNull Listener {

    @EventHandler
    private void PlayerInteract(PlayerInteractEvent e){

        Player player = e.getPlayer();

        if (e.getAction().isLeftClick()) return;
        if (e.getItem() == null) return;
        if (!e.getItem().isSimilar(CustomItems.MagicMef)) return;




        if (e.getClickedBlock() == null) {
            if (e.getItem().getType() == Material.AIR) return;}
        if (e.getAction().isRightClick()) {
        player.getInventory().setItemInMainHand(ItemStack.of(Material.AIR, 1));
            player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 1000, 5));
            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 400, 0));
            player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,200,1));
        player.sendMessage("§cYou're not well, maybe a bucket of milk will help.?");

        ItemStack material = new ItemStack(Material.SAND);
        }






    }

    @Override
    public void onOpen(WebSocket webSocket) {
        WebSocket.Listener.super.onOpen(webSocket);
    }
}
