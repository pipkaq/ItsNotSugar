package Commands;

import ezmefchik.krutoiplug.CustomItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class GetItemsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        Player player = (Player) commandSender;

        Inventory inventory;
        inventory = Bukkit.createInventory(null, 27, "Give-Mef gui");

        inventory.setItem(0, CustomItems.MagicMef);

        inventory.setItem(1, CustomItems.RightMef);

        inventory.setItem(2, CustomItems.LeftMef);

        player.openInventory(inventory);





        return false;


    }



}
