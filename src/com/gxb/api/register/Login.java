package com.gxb.api.register;

import org.json.JSONException;
import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * 定义Login类，获取公信链Login编号
 * @author Wolkin
 *
 */
public class Login implements APIObj{
	private JSONObject jsonObject = null;
	
	@Override
	public JSONObject jsonObj() {
		// TODO Auto-generated method stub
		return this.jsonObject;
	}

	@Override
	public void doParameter(String paraStr) {
		String objectStr = "{" + 
							"\"jsonrpc\": \"2.0\", " + 
							"\"method\": \"call\", " + 
							"\"params\": [1, \"login\", [\"\",\"\"]], " + 
							"\"id\":1" + 
							"}";
		try {
			this.jsonObject = new JSONObject(objectStr);
			System.out.println(objectStr);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
