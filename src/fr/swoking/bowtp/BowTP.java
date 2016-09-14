package fr.swoking.bowtp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BowTP extends JavaPlugin{
		public Events events;
		
		public void onEnable() {
			this.events = new Events(this);
			PluginManager pm = Bukkit.getPluginManager();
			pm.registerEvents(events, this);
		
		}
}
