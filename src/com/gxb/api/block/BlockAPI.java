package com.gxb.api.block;

import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * ������Ϣ�ӿڶ���
 * @author Wolkin
 *
 */

public abstract class BlockAPI implements APIObj{
	
	@Override
	public abstract JSONObject jsonObj();
	
	@Override
	public abstract void doParameter(String paraStr);
}
