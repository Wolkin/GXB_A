package com.gxb.api.block;

/**
 * ªÒ»°¡¥ID
 * @author Wolkin
 *
 */
public class GetChainId extends BlockAPI {

	@Override
	public void doParameter(String paraStr) {
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"get_chain_id\", []], " + 
				           "\"id\":1" + 
				       "}";
	}

}
