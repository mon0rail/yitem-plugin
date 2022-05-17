package com.mon0rail.fisrtplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class MyCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label,
			@NotNull String[] args) {
		
		ItemStack item;
		
		if (sender instanceof Player) {
			Player p = (Player)sender;
			
			double ypos = p.getLocation().getY();
			if (ypos > 65) {
				item = new ItemStack(Material.OAK_LOG, 16);
			} else if (ypos > 0) {
				item = new ItemStack(Material.STONE, 16);
			} else {
				item = new ItemStack(Material.IRON_INGOT, 16);
			}

			if (checkEnoughSpaceFor(p, item)) {
				p.getInventory().addItem(item);
				p.sendMessage("현재 높이(y): "+ypos);
				p.sendMessage("아이템이 지급되었습니다.");
			} else {
				p.sendMessage("인벤토리가 가득 차 아이템을 지급할 수 없습니다.");
			}
		}
		else {
			sender.sendMessage("이 명령어는 콘솔에서 실행할 수 없습니다.");
		}
		
		return true;
	}
	
	
	private boolean checkEnoughSpaceFor(Player player, ItemStack itemToAdd) {
		int freeSpace = 0;
		ItemStack i;
		Inventory inv = player.getInventory();
		
		for (int index = 0; index < inv.getSize()-6; index++) {
			if (inv.getItem(index) == null) {
				freeSpace+=itemToAdd.getType().getMaxStackSize();
			} else {
				i = inv.getItem(index);
				if (i.getType() == itemToAdd.getType()) {
					freeSpace+=i.getType().getMaxStackSize() - i.getAmount();
				}
			}
		}
		//player.sendMessage(itemToAdd.getAmount()+" , "+freeSpace);
		
		return itemToAdd.getAmount() <= freeSpace;
	}
	
}
