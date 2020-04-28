package antox11200.practice.fr.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import antox11200.practice.fr.player.PracticePlayer;
import antox11200.practice.fr.player.PracticePlayerState;

public class EntityDamageListener implements Listener {

	@EventHandler
	public void EntityDamageEvent_(EntityDamageEvent e) {
		if(!(e.getEntity() instanceof Player))return;
		PracticePlayer player = PracticePlayer.getPracticePlayer((Player) e.getEntity());
		
		if(!player.inState(PracticePlayerState.INFIGHT))
			e.setCancelled(true);
	}
}
