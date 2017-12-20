package com.gxb.api.wallet;

import org.json.JSONException;
import org.json.JSONObject;


/**
 * 获取资产账户信息
 * @author Wolkin
 *
 */
public class GetAccountBalances extends WalletAPI {
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
		// TODO Auto-generated method stub
		//多参数以逗号分隔的识别
		String temStr = "";
		if(paraStr.contains(",")) {
			temStr = paraStr.replace(",", "\",\"");
		}else {
			temStr = paraStr;
		}
		
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"get_account_balances\", [\"" + temStr + "\"]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
