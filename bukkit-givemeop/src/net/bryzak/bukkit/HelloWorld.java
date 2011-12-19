package net.bryzak.bukkit;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin{
    Logger log = Logger.getLogger("Minecraft");
    
    public void onEnable(){
        log.info("Hello World!");
    }
    
    public void onDisable(){
        log.info("So Long World!");
    }
}
