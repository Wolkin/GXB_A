package com.gxb.api.register.global;

/**
 * 根据ID查询目标对象
 * @author Wolkin
 *
 */

public class GetObjects extends GlobalAPI {

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
				           "\"params\": [0, \"get_objects\", [[\"" + temStr + "\"]]], " + 
				           "\"id\":1" + 
				       "}";
	}
	
}
