package net.frostcraftsman.gimmickery;

import java.util.logging.Logger;

import net.frostcraftsman.gimmickery.proxy.GimmickeryCommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="gimmickery", name="Gimmickery", version=Gimmickery.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Gimmickery {
	
	public static final String VERSION = "0.0.1";
	public static Logger log = Logger.getLogger("gimmickery");
	public static CreativeTabs cct = new GimmickeryCreativeTabs("Gimmickery");
	
	@Instance("gimmickery")
    public static Gimmickery instance;
	
	@SidedProxy(
            clientSide = "net.frostcraftsman.gimmickery.proxy.GimmickeryClientProxy",
            serverSide = "net.frostcraftsman.gimmickery.proxy.GimmickeryCommonProxy"
    )
    public static GimmickeryCommonProxy proxy;
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		 log.setParent(FMLLog.getLogger());
	     log.info("Starting Gimmickery " + Gimmickery.VERSION);
	     
	     proxy.preInit();
	}
	 
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		 proxy.init();
	}
	 
	@EventHandler
	public void postLoad(FMLPostInitializationEvent event)
	{
		 proxy.postInit();
	}
}
