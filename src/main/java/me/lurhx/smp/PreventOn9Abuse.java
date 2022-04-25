package me.lurhx.smp;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitScheduler;

import static org.bukkit.Bukkit.getOnlinePlayers;
import static org.bukkit.Bukkit.getServer;


public final class PreventOn9Abuse extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new listener(), this);

        BukkitScheduler scheduler = getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                Player[] players = Bukkit.getServer().getOnlinePlayers().toArray(new Player[0]);
                for(int i=0;i<players.length;i++)
                {
                    System.out.println(players[i].getDisplayName()+ " is at " + players[i].getLocation());
                }
                if(players.length == 0)
                {
                    System.out.println("no players is online");
                }
            }
        }, 0L, 1200L);
    }
}
