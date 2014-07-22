package net.frostcraftsman.gimmickery.proxy;

import cpw.mods.fml.common.registry.LanguageRegistry;


/**
* 加载代理（Server端）
*/
public class GimmickeryCommonProxy {

	/**
	 * 执行第1阶段的加载行为。
	 */
	public void preInit() {
	    	
	}
	    
	/**
	 * 执行第2阶段的加载行为。
	 */
	public void init() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.Gimmickery", "Gimmickery"); //创造模式栏的名称
	}
	    
	/**
	 * 执行第3阶段的加载行为。
	 */
	public void postInit() {
		
	}

}

