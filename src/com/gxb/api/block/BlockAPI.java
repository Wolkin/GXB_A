package com.gxb.api.block;

import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * 区块信息接口对象
 * @author Wolkin
 *
 */

public abstract class BlockAPI implements APIObj{
	
	@Override
	public abstract JSONObject jsonObj();
	
	@Override
	public abstract void doParameter(String paraStr);
}
