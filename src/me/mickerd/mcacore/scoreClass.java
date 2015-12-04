package me.mickerd.mcacore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class scoreClass {
	static ScoreboardManager manager = Bukkit.getScoreboardManager();
	static Scoreboard board = manager.getNewScoreboard();
	static Objective objective = board.registerNewObjective("test", "dummy");
	static{
		//Setting where to display the scoreboard/objective (either SIDEBAR, PLAYER_LIST or BELOW_NAME)
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		 
		//Setting the display name of the scoreboard/objective
		objective.setDisplayName(ChatColor.RED + "MCAEvents");
		Score score = objective.getScore(ChatColor.GRAY + "Cado's :");
		score.setScore(0);
	}
	
	

}
