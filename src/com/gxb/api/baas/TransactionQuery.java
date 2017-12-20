package com.gxb.api.baas;

/**
 * 交易信息查询/api/transaction/:tx_id
 * @author Wolkin
 *
 */

public class TransactionQuery extends BaasAPI{
	private String tx_id = "";   //交易 ID
	
	@Override
	public JSONObject jsonObj() {
		return "transaction/" + tx_id;
	}

	@Override
	public void doParameter(String paraStr) {
		this.tx_id = paraStr;
	}

	public String getTx_id() {
		return tx_id;
	}

	public void setTx_id(String tx_id) {
		this.tx_id = tx_id;
	}
}
