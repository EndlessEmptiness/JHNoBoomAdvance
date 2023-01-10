package cn.dreamside.jh_noboom_advance;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class PluginMain extends JavaPlugin {
    public static JavaPlugin instance;
    @Override
    public void onLoad() {
        instance = this;
        saveDefaultConfig();
    }
    @Override
    public void onEnable() {
        List<String> Messages = getConfig().getStringList("dsna.enable-messages");
        for (String a : Messages) getLogger().info(a);
        Bukkit.getPluginManager().registerEvents(new ExplosionListener(), this);
    }
    @Override
    public void onDisable() { saveConfig(); }
}
