package com.gxb.api.block;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * ��ȡ��ID
 * @author Wolkin
 *
 */
public class GetChainId extends BlockAPI {
	private String jsonStr = "";
	
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
	public void doParameter(String paraStr) {
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"get_chain_id\", []], " + 
				           "\"id\":1" + 
				       "}";
	}

}