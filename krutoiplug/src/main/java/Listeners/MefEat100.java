package Listeners;

import ezmefchik.krutoiplug.CustomItems;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.net.http.WebSocket;
import java.util.concurrent.CompletionStage;

public class MefEat100 implements WebSocket.Listener, @NotNull Listener {
    @EventHandler
    private void PlayerInteract(PlayerInteractEvent e){

        Player player = e.getPlayer();

        if (e.getAction().isLeftClick()) return;
        if (e.getItem() == null) return;
        if (!e.getItem().isSimilar(CustomItems.RightMef)) return;




        if (e.getClickedBlock() == null) {
            if (e.getItem().getType() == Material.AIR) return;}
        if (e.getAction().isRightClick()) {
            player.getInventory().setItemInMainHand(ItemStack.of(Material.AIR, 1));
            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 60, 5));
            player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 2));
            player.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH,150,2));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,300,1));
            player.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE,300,2));

            player.sendMessage("§cA life of highs!");

        }
    }



    @Override
    public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
        return WebSocket.Listener.super.onText(webSocket, data, last);
    }

}
