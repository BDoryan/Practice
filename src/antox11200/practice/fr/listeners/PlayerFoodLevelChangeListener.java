package antox11200.practice.fr.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import antox11200.practice.fr.player.PracticePlayer;
import antox11200.practice.fr.player.PracticePlayerState;

public class PlayerFoodLevelChangeListener implements Listener {

	@EventHandler
	public void FoodLevelChangeEvent_(FoodLevelChangeEvent e) {
		if(!(e.getEntity() instanceof Player))return;
		PracticePlayer player = PracticePlayer.getPracticePlayer((Player) e.getEntity());
		if(!player.inState(PracticePlayerState.INFIGHT))
		e.setCancelled(true);
	}
}
