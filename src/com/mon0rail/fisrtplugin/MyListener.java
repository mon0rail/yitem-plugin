package com.mon0rail.fisrtplugin;

import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class MyListener implements Listener {
	
	/*
	
	@EventHandler
	public void onPlayerChat(PlayerChatEvent e) {
		
		Player p = e.getPlayer();
		p.sendMessage("¾È³ç");
	}
	
	@EventHandler
	private void onPlayerJump(PlayerJumpEvent e) {
		
		Player p = e.getPlayer();
		p.sendActionBar("jump");

	}
	
	@EventHandler
	private void onBlockBreak(BlockBreakEvent e) {
		
		Block block = e.getBlock();
		if (block.isSolid() && block.getType()!=Material.DIAMOND_BLOCK) {
			e.setCancelled(true);
			block.setType(Material.DIAMOND_BLOCK);
		}
		

	}
	
	
	@EventHandler
	private void onAnimalDamaged(EntityDamageByEntityEvent e) {
		
		Entity damager = e.getDamager();
		LivingEntity victim = (LivingEntity)e.getEntity();
		
		if (damager instanceof Player) {
			if (victim instanceof Animals) {
				
				victim.setHealth(0);
				e.setCancelled(true);
				
			}
		}
			
	}
	*/
	
}