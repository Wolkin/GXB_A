package com.gxb.api.register.global;

/**
 * ֹͣ���ж��ģ��ص���
 * @author Wolkin
 *
 */
public class CancelAllSubscriptions extends GlobalAPI {

	@Override
	public void doParameter(String paraStr) {
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"cancel_all_subscriptions\", [[]]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
