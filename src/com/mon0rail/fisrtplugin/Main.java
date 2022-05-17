package com.mon0rail.fisrtplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		super.onEnable();
		System.out.println("onEnable");
		
		
		MyListener myLis = new MyListener();
		getServer().getPluginManager().registerEvents(myLis, this);
		getCommand("yitem").setExecutor(new MyCommand());
	}
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
		System.out.println("onDisable");
	}
	

}
