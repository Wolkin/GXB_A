package com.gxb.api.wallet;

/**
 * 对钱包设置一个新密码。首次启动钱包，需要设置密码
 * usage: set_password new_password
 * 参数	new_password  钱包密码
 * @author jjwang
 *
 */
public class SetPassWord extends WalletAPI {
	private String new_password = "";
	
	/*
	 * 缺省构造函数
	 */
	public SetPassWord() {
		
	}
	
	@Override
	public String jsonObj() {
		
		return this.new_password;
	}

	@Override
	public void doParameter(String paraStr) {
		this.new_password = paraStr;
	}
	
	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}
}
