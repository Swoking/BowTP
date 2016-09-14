package fr.swoking.bowtp;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;


public class Events implements Listener{
	
public BowTP btp;
	
	public Events(BowTP pl) {
		btp = pl; 
	}
	
	@EventHandler
    public void launch(EntityShootBowEvent e)
    {
            Player p = (Player) e.getEntity();
           
            if(e.getEntity() instanceof Player)
            {
                    Projectile projo = (Projectile) e.getProjectile();
                    projo.setPassenger(p);
            }
    }
   
    @EventHandler
    public void PIEE(PlayerInteractEntityEvent e)
    {
            Player p = e.getPlayer();
           
            e.getRightClicked().setPassenger(p);           
    }
   
    @EventHandler
    public void BPE(BlockPhysicsEvent e)
    {
            if(e.getBlock().getType() == Material.BOW)
            {
                    e.setCancelled(true);
            }
    }
}
