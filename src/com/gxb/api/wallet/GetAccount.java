package com.gxb.api.wallet;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 账户查询
 * @author Wolkin
 *
 */
public class GetAccount extends WalletAPI {

	private JSONObject jsonObject = null;
	
	/**
	 * 缺省构造函数
	 */
	public GetAccount() {
		
	}
	
	/**
	 * 当个账户查询以逗号分隔
	 */
	@Override
	public void doParameter(String paraStr) {
		String objectStr = "{" + 
				"\"jsonrpc\": \"2.0\", " + 
				"\"method\": \"call\", " + 
				"\"params\": [0, \"get_accounts\", [[\"" + paraStr + "\"]]], " + 
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
	
	@Override
	public JSONObject jsonObj() {
		
		return this.jsonObject;
	}

	public JSONObject getAccount_name_or_id() {
		return this.jsonObject;
	}

	public void setAccount_name_or_id(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
}
