package antox11200.practice.fr.utils;

import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public abstract class ItemHandler {

	public static final HashMap<String, ItemHandler> handlers = new HashMap<>();
	
	public static void register(String displayname, ItemHandler handler) {
		handlers.put(displayname, handler);
	}

	public static void run(Player player, ItemStack itemStack) {
		for (Entry<String, ItemHandler> handler : handlers.entrySet()) {
			if (itemStack.hasItemMeta() && itemStack.getItemMeta().hasDisplayName()
					&& itemStack.getItemMeta().getDisplayName().equalsIgnoreCase(handler.getKey())) {
				handler.getValue().process(player, itemStack);
			}
		}
	}

	public abstract void process(Player player, ItemStack itemStack);

}
