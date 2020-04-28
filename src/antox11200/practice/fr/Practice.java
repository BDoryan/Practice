package antox11200.practice.fr;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import antox11200.practice.fr.manager.ListenersManager;
import antox11200.practice.fr.player.PracticePlayer;

public class Practice extends JavaPlugin {

	private static Practice instance;
	
	@Override
	public void onEnable() {
		instance = this;
		
		ListenersManager.register();

		for(Player player : Bukkit.getOnlinePlayers()) {
			new PracticePlayer(player).join();
		}
	}
	
	@Override
	public void onDisable() {
	}
	
	public static void log(String log) {
		Bukkit.getConsoleSender().sendMessage(prefix()+" "+log);
	}
	
	public static String prefix() {
		return "§7[§cPractice§7]";
	}
	
	public static Practice instance() {
		return instance;
	}
}
