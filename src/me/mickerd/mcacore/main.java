package me.mickerd.mcacore;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	static Plugin pl = null;
	public void onEnable(){
		pl = this;
		getServer().getPluginManager().registerEvents(new Cadotjes(), this);
	}
	public void onDisable(){
		pl = null;
	}
	public Plugin getPl(){
		return pl;
	}
	
	

}
