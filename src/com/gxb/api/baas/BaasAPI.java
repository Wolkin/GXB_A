package com.gxb.api.baas;

import org.json.JSONException;
import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * 统计查询信息接口
 * @author Wolkin
 *
 */

public abstract class BaasAPI implements APIObj{
	protected String jsonStr = "";
	
	/**
	 * 打包接口反馈信息
	 */
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

	/**
	 * 参数处理
	 */
	@Override
	public abstract void doParameter(String paraStr);
}
