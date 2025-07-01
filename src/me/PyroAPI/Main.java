package me.PyroAPI;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;

        checkPlugin("PyroFishingPro", "4.10.0");
        checkPlugin("PyroMining", "5.0.0");
        checkPlugin("PyroWeatherPro", "5.0.0");
        checkPlugin("PyroFarming", "1.3.0");
    }

    @Override
    public void onDisable() {}

    @SuppressWarnings("deprecation")
	private void checkPlugin(String pluginName, String requiredVersion) {
        Plugin plugin = getServer().getPluginManager().getPlugin(pluginName);
        if(plugin != null) {
            String currentVersion = plugin.getDescription().getVersion();
            if(!isVersionAtLeast(currentVersion, requiredVersion)) {
                getLogger().severe(pluginName + " API Methods require at least v" + requiredVersion + " or higher to use! Support will not be given if any issues arise!");
            }else{
                getLogger().info(pluginName + " detected and version is OK.");
            }
        }
    }

    private boolean isVersionAtLeast(String currentVersion, String requiredVersion) {
        String[] currentParts = currentVersion.split("\\D+");
        String[] requiredParts = requiredVersion.split("\\.");

        int length = Math.max(currentParts.length, requiredParts.length);
        for(int i = 0; i < length; i++) {
            int current = (i < currentParts.length) ? Integer.parseInt(currentParts[i]) : 0;
            int required = (i < requiredParts.length) ? Integer.parseInt(requiredParts[i]) : 0;

            if(current > required) return true;
            if(current < required) return false;
        }
        
        return true;
    }

    public static Main getInstance() {
        return instance;
    }
}

