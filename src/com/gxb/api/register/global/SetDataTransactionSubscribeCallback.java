package com.gxb.api.register.global;

public class SetDataTransactionSubscribeCallback extends GlobalAPI {

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
				           "\"params\": [0, \"set_subscribe_callback\", [[\"" + temStr + "\"]]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
