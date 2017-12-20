package com.gxb.api.wallet;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 通过账户名获取账户信息
 * @author Wolkin
 *
 */
public class LookupAccountNames extends WalletAPI {
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
		String temStr = "";
		if(paraStr.contains(",")) {
			temStr = paraStr.replace(",", "\",\"");
		}else {
			temStr = paraStr;
		}
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"lookup_account_names\", [[\"" + temStr + "\"]]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
