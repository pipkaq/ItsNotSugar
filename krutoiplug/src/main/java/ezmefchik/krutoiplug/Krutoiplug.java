package ezmefchik.krutoiplug;

import Commands.GetItemsCommand;
import Commands.Recipes;
import Listeners.MefEat;
import Listeners.MefEat100;
import Listeners.MefEat50;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Krutoiplug extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("give-mef").setExecutor(new GetItemsCommand());

        PluginManager pluginManager = Bukkit.getPluginManager();
        getServer().getPluginManager().registerEvents(new MefEat(), this);
        getServer().getPluginManager().registerEvents(new MefEat50(), this);
        getServer().getPluginManager().registerEvents(new MefEat100(), this);

        CustomItems.Init();

        Recipes.registerRecipes();







    }

}