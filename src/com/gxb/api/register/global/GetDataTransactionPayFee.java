package com.gxb.api.register.global;

/**
 * 获取指定时间内数据交易的手续费
 * @author Wolkin
 *
 */
public class GetDataTransactionPayFee extends GlobalAPI {

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
							"\"params\": [0, \"get_data_transaction_pay_fee\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
