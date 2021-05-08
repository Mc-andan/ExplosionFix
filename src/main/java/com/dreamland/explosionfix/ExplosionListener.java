package com.dreamland.explosionfix;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;


public class ExplosionListener implements Listener {
    @EventHandler
    private void onExplosion(EntityExplodeEvent e) {
        e.blockList().removeIf(next -> ExplosionFix.getInstance().getConfig().getStringList("List").contains(next.getType().name()));
    }

    @EventHandler
    private void onExplosion(BlockExplodeEvent e) {
        e.blockList().removeIf(next -> ExplosionFix.getInstance().getConfig().getStringList("List").contains(next.getType().name()));
    }
}
