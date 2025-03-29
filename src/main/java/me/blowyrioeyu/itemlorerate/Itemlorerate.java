package me.blowyrioeyu.itemlorerate;

import me.blowyrioeyu.itemlorerate.commands.AddLoreCommand;
import me.blowyrioeyu.itemlorerate.events.InventoryListener;
import org.bukkit.plugin.java.JavaPlugin;

public class itemlorerate extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("addlore").setExecutor(new AddLoreCommand());

        getServer().getPluginManager().registerEvents(new InventoryListener(), this);

        getLogger().info("ItemLoreRate plugin đã được kích hoạt! (Developed by blowyrioeyu)");
    }

    @Override
    public void onDisable() {
        getLogger().info("ItemLoreRate plugin đã bị tắt!");
    }
}
