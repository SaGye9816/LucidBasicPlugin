package sagye.bgmplayer;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class BgmplayerMain extends JavaPlugin {

    private static final Logger log = Logger.getLogger("Minecraft");

    private static BgmplayerMain plugin;

    @Override
    public void onEnable() {

        // Plugin startup logic
        log.info(ChatColor.BLUE + "BGM Player Plugin has been enabled!");
        this.getCommand("브금").setExecutor(new BgmCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log.info(ChatColor.RED + "BGM Player Plugin has been disabled!");
    }

    public static BgmplayerMain getInstance() {
        return plugin;
    }
}
