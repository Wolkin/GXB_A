package com.gxb.api.block;

import org.json.JSONException;
import org.json.JSONObject;

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
