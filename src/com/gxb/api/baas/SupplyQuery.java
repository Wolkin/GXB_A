package com.gxb.api.baas;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * http://block.gxb.io/api/supply
 * @author Wolkin
 *
 */

public class SupplyQuery extends BaasAPI {
	/**
	 * 缺省构造函数
	 */
	public SupplyQuery() {
		
	}
	
	@Override
	public void doParameter(String paraStr) {
		//参数处理
	}
	
	@Override
	public JSONObject jsonObj() {
		JSONObject temp = null;
		try {
			temp = new JSONObject("supply");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
}
