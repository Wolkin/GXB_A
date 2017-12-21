package com.gxb.api.wallet;

import org.json.JSONException;
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
	public JSONObject jsonObj() {
		JSONObject jsonObj = null;
		try {
			jsonObj = new JSONObject(this.jsonStr);
			System.out.println(jsonObj.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObj;
	}
	
	@Override
	public abstract void doParameter(String paraStr);
}
