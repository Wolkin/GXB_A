package com.gxb.api.wallet;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 账户查询
 * @author Wolkin
 *
 */
public class GetAccount extends WalletAPI {

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
							"\"params\": [0, \"get_accounts\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}
	
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
}
