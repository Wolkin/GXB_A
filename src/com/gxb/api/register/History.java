package com.gxb.api.register;

import org.json.JSONException;
import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * 定义History类，注册获取公信链History api编号
 * @author Wolkin
 *
 */
public class History  implements APIObj{
	private JSONObject jsonObject = null;
	
	@Override
	public JSONObject jsonObj() {
		// TODO Auto-generated method stub
		return this.jsonObject;
	}

	@Override
	public void doParameter(String paraStr) {
		// TODO Auto-generated method stub
		String objectStr = "{" + 
				"\"method\": \"call\", " + 
				"\"params\": [1, \"history\", []], " + 
				"\"id\":3" + 
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
