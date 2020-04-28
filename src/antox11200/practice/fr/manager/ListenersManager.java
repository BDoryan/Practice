package antox11200.practice.fr.manager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import antox11200.practice.fr.Practice;
import antox11200.practice.fr.listeners.EntityDamageListener;
import antox11200.practice.fr.listeners.EntitySpawnListener;
import antox11200.practice.fr.listeners.PlayerBlockListener;
import antox11200.practice.fr.listeners.PlayerDropItemListener;
import antox11200.practice.fr.listeners.PlayerFoodLevelChangeListener;
import antox11200.practice.fr.listeners.PlayerInteractListener;
import antox11200.practice.fr.listeners.PlayerJoinListener;
import antox11200.practice.fr.listeners.PlayerQuitListener;

public class ListenersManager {
	
	public static void register() {
		PluginManager pluginManager = Bukkit.getPluginManager();
		pluginManager.registerEvents(new PlayerJoinListener(), Practice.instance());
		pluginManager.registerEvents(new PlayerQuitListener(), Practice.instance());
		pluginManager.registerEvents(new PlayerFoodLevelChangeListener(), Practice.instance());
		pluginManager.registerEvents(new EntitySpawnListener(), Practice.instance());
		pluginManager.registerEvents(new EntityDamageListener(), Practice.instance());
		pluginManager.registerEvents(new PlayerBlockListener(), Practice.instance());
		pluginManager.registerEvents(new PlayerDropItemListener(), Practice.instance());
		pluginManager.registerEvents(new PlayerInteractListener(), Practice.instance());
	}
}
