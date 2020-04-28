package antox11200.practice.fr.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import antox11200.practice.fr.utils.ItemHandler;

public class PlayerInteractListener implements Listener {
	
	@EventHandler
	public void PlayerInteractEvent_(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		if(player.getItemInHand() != null && player.getItemInHand().getType() == Material.AIR)return;
		ItemHandler.run(player, player.getItemInHand());
	}
}
