package antox11200.practice.fr.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import antox11200.practice.fr.Practice;
import antox11200.practice.fr.player.PracticePlayer;

public class PlayerQuitListener implements Listener {
	
	@EventHandler
	public void PlayerQuitEvent_(PlayerQuitEvent e) {
		Player player = e.getPlayer();
		PracticePlayer practicePlayer = PracticePlayer.getPracticePlayer(player);
		practicePlayer.leave();
		e.setQuitMessage(Practice.prefix()+" §9[§c-§9] §f"+player.getName());
	}
}
