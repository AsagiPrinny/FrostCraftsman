package net.frostcraftsman.gimmickery.proxy;

import cpw.mods.fml.common.registry.LanguageRegistry;


/**
* ���ش���Server�ˣ�
*/
public class GimmickeryCommonProxy {

	/**
	 * ִ�е�1�׶εļ�����Ϊ��
	 */
	public void preInit() {
	    	
	}
	    
	/**
	 * ִ�е�2�׶εļ�����Ϊ��
	 */
	public void init() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.Gimmickery", "Gimmickery"); //����ģʽ��������
	}
	    
	/**
	 * ִ�е�3�׶εļ�����Ϊ��
	 */
	public void postInit() {
		
	}

}

