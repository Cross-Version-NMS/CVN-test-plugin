package io.github.spigotcvn.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class DummyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().disablePlugin(this);
    }
}