package com.gxb.api.wallet;

/**
 * 账户头像  /api/header/:account_name
 * @author Wolkin
 *
 */

public class AccountHeader extends WalletAPI {
	private String account_name = "";   //账户名
	
	@Override
	public String jsonObj() {
		// TODO Auto-generated method stub
		return "header/" + account_name;
	}

	@Override
	public void doParameter(String paraStr) {
		// TODO Auto-generated method stub
		this.account_name = paraStr;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
}
