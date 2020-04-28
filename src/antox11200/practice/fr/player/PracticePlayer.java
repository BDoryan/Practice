package antox11200.practice.fr.player;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import antox11200.practice.fr.items.GameItem;
import antox11200.practice.fr.utils.ItemBuilder;

public class PracticePlayer {

	private Player player;
	private PracticePlayerState state;

	public PracticePlayer(Player player) {
		this.player = player;
	}

	public void join() {
		practicePlayers.put(player.getUniqueId().toString(), this);
		spawn();
	}

	public void spawnItems() {
		Inventory inventory = player.getInventory();
		
		inventory.setItem(0, GameItem.UNRANKED_ITEM.build());
		inventory.setItem(1, GameItem.RANKED_ITEM.build());
		inventory.setItem(2, GameItem.PREMIUM_ITEM.build());
		inventory.setItem(4, new ItemBuilder(Material.NETHER_STAR).displayname("§9Party").build());
		inventory.setItem(8, new ItemBuilder(Material.NETHER_STAR).displayname("§9Edit kit").build());
	}

	public void spawn() {
		player.teleport(new Location(Bukkit.getWorld("world"), -11.5, 146.5, -5.5, -45, 0));
		player.setGameMode(GameMode.ADVENTURE);
		state = PracticePlayerState.INSPAWN;
		heal();
		feed();
		clearAll();
		spawnItems();
	}

	public void feed() {
		player.setFoodLevel(20);
	}

	public void heal() {
		player.setHealth(20D);
	}

	public void clearAll() {
		clearEquipment();
		clearInventory();
	}

	public void clearEquipment() {
		this.player.getEquipment().setHelmet(null);
		this.player.getEquipment().setChestplate(null);
		this.player.getEquipment().setLeggings(null);
		this.player.getEquipment().setBoots(null);
	}

	public void clearInventory() {
		this.player.getInventory().clear();
	}
	
	public void leave() {
		practicePlayers.remove(player.getUniqueId().toString());
	}

	public void death() {

	}
	
	public boolean inState(PracticePlayerState... states) {
		for(PracticePlayerState state : states) {
			if(this.state == state)return true;
		}
		return false;
	}
	
	public PracticePlayerState getState() {
		return state;
	}

	public Player getPlayer() {
		return player;
	}

	/**
	 * 
	 * PracticePlayer manager
	 * 
	 */
	protected static final HashMap<String, PracticePlayer> practicePlayers = new HashMap<String, PracticePlayer>();

	public static PracticePlayer getPracticePlayer(Player player) {
		return getPracticePlayer(player.getUniqueId());
	}

	public static PracticePlayer getPracticePlayer(UUID uuid) {
		return practicePlayers.get(uuid.toString());
	}

	public static PracticePlayer getPracticePlayer(String uuid) {
		return practicePlayers.get(uuid);
	}
}
