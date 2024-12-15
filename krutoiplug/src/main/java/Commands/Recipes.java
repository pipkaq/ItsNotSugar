package Commands;

import ezmefchik.krutoiplug.CustomItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

public class Recipes {
    public static void registerRecipes(){

        NamespacedKey leftRecipeKey = new NamespacedKey("recipes", "left_recipe");
        ShapedRecipe leftRecipe = new ShapedRecipe(leftRecipeKey, CustomItems.LeftMef);
        leftRecipe.shape(" s ",
                         "sls",
                         " s ");

        leftRecipe.setIngredient('l', Material.GOLDEN_APPLE);
        leftRecipe.setIngredient('s', CustomItems.MagicMef); // крафт мефа 50%

        Bukkit.getServer().addRecipe(leftRecipe);


        NamespacedKey rightRecipeKey = new NamespacedKey("recipes", "right_recipe");
        ShapedRecipe rightRecipe = new ShapedRecipe(rightRecipeKey, CustomItems.RightMef);
        rightRecipe.shape("gfg",
                          "faf",
                          "gfg");

        rightRecipe.setIngredient('a', Material.GOLDEN_APPLE);
        rightRecipe.setIngredient('f', CustomItems.LeftMef);
        rightRecipe.setIngredient('g', Material.LARGE_FERN); // крафт мефа 100%

        Bukkit.getServer().addRecipe(rightRecipe);

        NamespacedKey mefRecipeKey = new NamespacedKey("recipes", "mef_recipe");
        ShapedRecipe mefRecipe = new ShapedRecipe(mefRecipeKey, CustomItems.MagicMef);
        mefRecipe.shape(" q ",
                        "qwq",
                        " q ");

        mefRecipe.setIngredient('q', Material.WHITE_DYE);
        mefRecipe.setIngredient('w', Material.SUGAR); // крафт мефа 10%

        Bukkit.getServer().addRecipe(mefRecipe);

    }
}
