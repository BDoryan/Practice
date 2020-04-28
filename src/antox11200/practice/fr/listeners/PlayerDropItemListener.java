package antox11200.practice.fr.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import antox11200.practice.fr.player.PracticePlayer;
import antox11200.practice.fr.player.PracticePlayerState;

public class PlayerDropItemListener implements Listener {
	
	@EventHandler
	public void PlayerDropItemEvent_(PlayerDropItemEvent e){
		PracticePlayer player = PracticePlayer.getPracticePlayer(e.getPlayer());
		if(!player.inState(PracticePlayerState.INFIGHT)) 
			e.setCancelled(true);
	}
}
