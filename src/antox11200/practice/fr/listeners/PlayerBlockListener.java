package antox11200.practice.fr.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlayerBlockListener implements Listener {
	
	public void BlockPlaceEvent_(BlockPlaceEvent e) {
		Player player = e.getPlayer();
		e.setCancelled(true);
	}
	
	public void BlockBreakEvent_(BlockBreakEvent e) {
		Player player = e.getPlayer();
		e.setCancelled(true);
	}
}
