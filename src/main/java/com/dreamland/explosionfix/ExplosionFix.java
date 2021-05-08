package com.dreamland.explosionfix;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class ExplosionFix extends JavaPlugin {


    static ExplosionFix instance;

    public static ExplosionFix getInstance(){
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        loadcfg();
        getLogger().info("Plugin Enable!");
        getServer().getPluginManager().registerEvents(new ExplosionListener(),this);

    }

    private void loadcfg() {
        File f = new File(getDataFolder()+"/config.yml");
        if (f.exists()){

        }else {
            saveDefaultConfig();
        }
        reloadConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
