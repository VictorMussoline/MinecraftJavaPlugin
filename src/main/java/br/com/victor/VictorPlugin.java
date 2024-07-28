package br.com.victor;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class VictorPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage("Oi, tudo bem? Plugin Ligado!");

    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage("Oi, tudo bem? Plugin Desligado!");

    }
}
