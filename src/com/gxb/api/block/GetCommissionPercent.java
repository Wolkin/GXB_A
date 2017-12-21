package com.gxb.api.block;

/**
 * 获取佣金比例
 * @author Wolkin
 *
 */
public class GetCommissionPercent extends BlockAPI {

	@Override
	public void doParameter(String paraStr) {
		this.jsonStr = "{" + 
		           "\"jsonrpc\": \"2.0\", " + 
		           "\"method\": \"call\", " + 
		           "\"params\": [0, \"get_commission_percent\", []], " + 
		           "\"id\":1" + 
		       "}";
	}

}
