package com.gxb.api.wallet;

public class GetVestingBalances extends WalletAPI {

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
				           "\"params\": [0, \"get_vesting_balances\", [\"" + temStr + "\"]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
