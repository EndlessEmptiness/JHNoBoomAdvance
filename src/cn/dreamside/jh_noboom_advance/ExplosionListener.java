package cn.dreamside.jh_noboom_advance;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;
import java.util.logging.Logger;

import static org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK;

public class ExplosionListener implements Listener {
    @EventHandler
    public void onEntityExplosion(ExplosionPrimeEvent e) {
        // 实体爆炸
        if (e.getEntityType() == EntityType.PRIMED_TNT) {
            switch(e.getEntity().getWorld().getName()) {
                case "world":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.tnt.world",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "world_nether":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.tnt.nether",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "world_the_end":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.tnt.the_end",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "resource":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.tnt.resource",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "1171":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.tnt.1171",false)) {
                        e.setCancelled(true);
                    }
                    break;
            }
        }
        else if (e.getEntityType() == EntityType.MINECART_TNT) {
            switch(e.getEntity().getWorld().getName()) {
                case "world":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.tnt_minecrat.world",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "world_nether":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.tnt_minecrat.nether",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "world_the_end":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.tnt_minecrat.the_end",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "resource":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.tnt_minecrat.resource",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "1171":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.tnt_minecrat.1171",false)) {
                        e.setCancelled(true);
                    }
                    break;
            }
        }
        else if (e.getEntityType() == EntityType.ENDER_CRYSTAL) {
            switch(e.getEntity().getWorld().getName()) {
                case "world":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.ender_crystal.world",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "world_nether":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.ender_crystal.nether",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "world_the_end":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.ender_crystal.the_end",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "resource":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.ender_crystal.resource",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "1171":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.ender_crystal.1171",false)) {
                        e.setCancelled(true);
                    }
                    break;
            }
        }
        else if (e.getEntityType() == EntityType.WITHER_SKULL) {
            switch(e.getEntity().getWorld().getName()) {
                case "world":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.wither_skull.world",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "world_nether":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.wither_skull.nether",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "world_the_end":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.wither_skull.the_end",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "resource":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.wither_skull.resource",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "1171":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.wither_skull.1171",false)) {
                        e.setCancelled(true);
                    }
                    break;
            }
        }
        else if (e.getEntityType() == EntityType.CREEPER) {
            switch(e.getEntity().getWorld().getName()) {
                case "world":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.creeper.world",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "world_nether":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.creeper.nether",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "world_the_end":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.creeper.the_end",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "resource":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.creeper.resource",false)) {
                        e.setCancelled(true);
                    }
                    break;
                case "1171":
                    if(!PluginMain.instance.getConfig().getBoolean("dsna.entites.creeper.1171",false)) {
                        e.setCancelled(true);
                    }
                    break;
            }
        }
    }

    @EventHandler
    public void onBlockExplosion (PlayerInteractEvent e) {
        if(!e.getAction().equals(RIGHT_CLICK_BLOCK)) return; // only limit right click
        String WorldName;
        String BlockName;
        Material BlockType;
        boolean BedWorks;
        boolean RespawnAuchorWorks;
        boolean Cancel = false;
        if (e.getClickedBlock() != null) {
            WorldName = e.getClickedBlock().getWorld().getName();
            BlockName = e.getClickedBlock().getType().name();
            BlockType = e.getClickedBlock().getType();
            BedWorks = e.getClickedBlock().getWorld().isBedWorks();
            RespawnAuchorWorks = e.getClickedBlock().getWorld().isRespawnAnchorWorks();

//            PluginMain.instance.getLogger().info(e.getAction().name()); // fix 2023-1-7-1236
            //        PluginMain.instance.getLogger().info(e.getClickedBlock().getWorld().getName());
            if (BlockType == Material.WHITE_BED ||
                    BlockType == Material.ORANGE_BED ||
                    BlockType == Material.MAGENTA_BED ||
                    BlockType == Material.LIGHT_BLUE_BED ||
                    BlockType == Material.YELLOW_BED ||
                    BlockType == Material.LIME_BED ||
                    BlockType == Material.PINK_BED ||
                    BlockType == Material.GRAY_BED ||
                    BlockType == Material.LIGHT_GRAY_BED ||
                    BlockType == Material.CYAN_BED ||
                    BlockType == Material.PURPLE_BED ||
                    BlockType == Material.BLUE_BED ||
                    BlockType == Material.BROWN_BED ||
                    BlockType == Material.GREEN_BED ||
                    BlockType == Material.RED_BED ||
                    BlockType == Material.BLACK_BED
            ) {
//                PluginMain.instance.getLogger().info("Bed used; DIM-"+WorldName);
                switch (WorldName) {
                    case "world":
                        if (!PluginMain.instance.getConfig().getBoolean("dsna.blocks.bed.world", true)) {
                            Cancel = true;
                        }
                        break;
                    case "world_nether":
                        if (!PluginMain.instance.getConfig().getBoolean("dsna.blocks.bed.nether", false)) {
                            Cancel = true;
                        }
                        break;
                    case "world_the_end":
                        if (!PluginMain.instance.getConfig().getBoolean("dsna.blocks.bed.the_end", false)) {
                            Cancel = true;
                        }
                        break;
                    case "resource":
                        if (!PluginMain.instance.getConfig().getBoolean("dsna.blocks.bed.resource", false)) {
                            Cancel = true;
                        }
                        break;
                    case "1171":
                        if (!PluginMain.instance.getConfig().getBoolean("dsna.blocks.bed.1171", true)) {
                            Cancel = true;
                        }
                        break;
                }
                if(!(Cancel || BedWorks)) {
                    PluginMain.instance.getLogger().info("A bed is used in a world where they do not work; Position: "+
                            "{"+e.getClickedBlock().getX() + "," + e.getClickedBlock().getY() + "," + e.getClickedBlock().getZ()+"}; Player: "+e.getPlayer().getName());
                }
            }
            if (BlockType == Material.RESPAWN_ANCHOR) {
                switch (WorldName) {
                    case "world":
                        if (!PluginMain.instance.getConfig().getBoolean("dsna.blocks.respawn_auchor.world", false)) {
                            Cancel = true;
                        }
                        break;
                    case "world_nether":
                        if (!PluginMain.instance.getConfig().getBoolean("dsna.blocks.respawn_auchor.nether", true)) {
                            Cancel = true;
                        }
                        break;
                    case "world_the_end":
                        if (!PluginMain.instance.getConfig().getBoolean("dsna.blocks.respawn_auchor.the_end", false)) {
                            Cancel = true;
                        }
                        break;
                    case "resource":
                        if (!PluginMain.instance.getConfig().getBoolean("dsna.blocks.respawn_auchor.resource", false)) {
                            Cancel = true;
                        }
                    case "1171":
                        if (!PluginMain.instance.getConfig().getBoolean("dsna.blocks.respawn_auchor.1171", false)) {
                            Cancel = true;
                        }
                }
                if(!(Cancel || RespawnAuchorWorks)) {
                    PluginMain.instance.getLogger().info("A respawn anchor is used in a world where they do not work; Position: "+
                            "{"+e.getClickedBlock().getX() + "," + e.getClickedBlock().getY() + "," + e.getClickedBlock().getZ()+"}; Player: "+e.getPlayer().getName());
                }
            }
            if (Cancel) {
                e.getPlayer().sendMessage(ChatColor.RED + "您不能在维度\""+WorldName +"\"使用方块\""+BlockName+"\"");
                e.setCancelled(true);
            }
        } else {
            PluginMain.instance.getLogger().warning("A null-pointer error from spigot. This BUG Can Not Be Fixed, Do Not Report It!");
        }
    }
}
