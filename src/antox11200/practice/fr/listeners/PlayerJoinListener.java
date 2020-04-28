package antox11200.practice.fr.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import antox11200.practice.fr.Practice;
import antox11200.practice.fr.player.PracticePlayer;

public class PlayerJoinListener implements Listener {
	
	@EventHandler
	public void PlayerJoinEvent_(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		PracticePlayer practicePlayer = new PracticePlayer(player);
		practicePlayer.join();
		e.setJoinMessage(Practice.prefix()+" §9[§a+§9] §f"+player.getName());
	}
}
