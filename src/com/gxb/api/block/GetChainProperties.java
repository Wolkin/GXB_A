package com.gxb.api.block;

/**
 * ªÒ»°¡¥ Ù–‘
 * @author Wolkin
 *
 */
public class GetChainProperties extends BlockAPI {

	@Override
	public void doParameter(String paraStr) {
		
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"get_chain_properties\", []], " + 
				           "\"id\":1" + 
				       "}";
	}

}
