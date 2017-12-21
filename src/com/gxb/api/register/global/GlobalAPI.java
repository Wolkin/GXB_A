package com.gxb.api.register.global;

import org.json.JSONException;
import org.json.JSONObject;
import com.gxb.api.APIObj;

/**
 * 定义全局接口抽象类 实现jsonObj()方法
 * @author Wolkin
 *
 */

public abstract class GlobalAPI implements APIObj {
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
