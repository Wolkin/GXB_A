package com.gxb.api.wallet;

import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * 钱包信息接口对象
 * @author Wolkin
 *
 */

public abstract class WalletAPI implements APIObj{
	protected String jsonStr = "";
	
	@Override
	public abstract JSONObject jsonObj();
	
	@Override
	public abstract void doParameter(String paraStr);
}
