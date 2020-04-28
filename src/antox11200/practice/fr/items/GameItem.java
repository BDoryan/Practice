package antox11200.practice.fr.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import antox11200.practice.fr.utils.ItemBuilder;
import antox11200.practice.fr.utils.ItemHandler;

public class GameItem {

	public static final GameItem UNRANKED_ITEM = new GameItem(new ItemBuilder(Material.DIAMOND_SWORD).displayname("§9Unranked"), new ItemHandler() {
		@Override
		public void process(Player player, ItemStack itemStack) {
			System.out.println("unranked");
		}
	});
	public static final GameItem RANKED_ITEM = new GameItem(new ItemBuilder(Material.DIAMOND_SWORD).displayname("§9Ranked"), new ItemHandler() {
		@Override
		public void process(Player player, ItemStack itemStack) {
			System.out.println("ranked");
		}
	});
	public static final GameItem PREMIUM_ITEM = new GameItem(new ItemBuilder(Material.DIAMOND_SWORD).displayname("§9Premium"), new ItemHandler() {
		@Override
		public void process(Player player, ItemStack itemStack) {
			System.out.println("premium");
		}
	});
	
	private ItemBuilder itemBuilder;
	
	public GameItem(ItemBuilder itemBuilder, ItemHandler handler) {
		this.itemBuilder = itemBuilder;
		ItemHandler.register(itemBuilder.getDisplayname(), handler);
	}
	
	public ItemStack build() {
		return this.itemBuilder.build();
	}
}
