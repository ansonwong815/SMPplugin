package me.lurhx.smp;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.scheduler.BukkitScheduler;

import static org.bukkit.Bukkit.getServer;

public class listener implements Listener{
    @EventHandler(ignoreCancelled = true)
    public void onPlayerCommandPreprocess(final PlayerCommandPreprocessEvent event) {
        String message = event.getMessage();
        String arr[] = message.split(" ", 2);
        if(arr[0].equals("/tm")||arr[0].equals("/w")|| arr[0].equals("/w")|| arr[0].equals("/msg")|| arr[0].equals("/tm") || arr[0].equals("/tell")|| arr[0].equals("/teammsg")|| arr[0].equals("/execute"))
        {
            return;
        }
        else
        {
            Bukkit.broadcastMessage(event.getPlayer().getName() + " used " + event.getMessage());
        }
    }

}
