package com.gxb.api.register.global;

/**
 * 获取当前商户个数
 * @author Wolkin
 *
 */
public class GetMerchantsTotalCount extends GlobalAPI {

	@Override
	public void doParameter(String paraStr) {
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"get_merchants_total_count\", []], " + 
				           "\"id\":1" + 
				       "}";
	}
}
