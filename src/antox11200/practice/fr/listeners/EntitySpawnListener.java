package antox11200.practice.fr.listeners;

import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class EntitySpawnListener implements Listener {
	
	public void EntitySpawnEvent_(EntitySpawnEvent e) {
		if(e.getEntity() instanceof Player || e.getEntity() instanceof EnderPearl || e.getEntity() instanceof Item)return;
		e.setCancelled(true);
	}
}
