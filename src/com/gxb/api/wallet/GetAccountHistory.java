package com.gxb.api.wallet;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 查询公信宝指定账户历史信息
 * @author Wolkin
 *
 */
public class GetAccountHistory extends WalletAPI{
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
				"\"jsonrpc\": \"2.0\", " + 
				"\"method\": \"call\", " + 
				"\"params\": [3, \"get_account_history\", [[\"" + paraStr + "\"]]], " + 
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
