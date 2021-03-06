package com.gxb.api.register.global;

/**
 * 获取指定时间内数据交易的产品费用
 * @author Wolkin
 *
 */
public class GetDataTransactionProductCosts  extends GlobalAPI{

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
				           "\"params\": [0, \"get_data_transaction_product_costs\", [\"" + temStr + "\"]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
