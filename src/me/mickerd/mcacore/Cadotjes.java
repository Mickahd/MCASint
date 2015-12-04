package me.mickerd.mcacore;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class Cadotjes implements Listener, CommandExecutor {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		p.setScoreboard(scoreClass.board);
		
	}

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(arg3[0].equalsIgnoreCase("create")){
		Player p = (Player) arg0;
		 
		Inventory pi = p.getInventory();
		 
		ItemStack skull = new ItemStack(Material.SKULL, 1);
		 
		SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
		 
		 
		skullMeta.setOwner("Developer_M"); // Cadotjes skin // tests
		 
		skull.setItemMeta(skullMeta); 
		 
		pi.addItem(skull);
		
		}
		return false;
	}
}