package com.gxb.api.wallet;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * �˻���ѯ
 * @author Wolkin
 *
 */
public class GetAccount extends WalletAPI {

	/**
	 * ȱʡ���캯��
	 */
	public GetAccount() {
		
	}
	
	/**
	 * �����˻���ѯ�Զ��ŷָ�
	 */
	@Override
	public void doParameter(String paraStr) {
		//������Զ��ŷָ���ʶ��
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
