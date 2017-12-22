package com.gxb.dao.bean;

/**
 * Describe：竞猜记录的JavaBean
 * @author wlma
 * 
 */
public class GuessRecord {

	private String guessNo;	//竞猜编号
	private String wallet;	//竞猜钱包帐号
	private String gxsNum;	//投注GXS数量
	private String guessValue;	//竞猜值
	private String guessDate;	//竞猜日期时间
	private String guessTerm;	//竞猜期次
	private String guessStatus;	//竞猜状态 0-新发生 1-生效 2-失效
	private String remark;	//备注

	public GuessRecord() {
		// TODO Auto-generated constructor stub
	}

	public String getGuessNo() {
		return guessNo;
	}

	public void setGuessNo(String guessNo) {
		this.guessNo = guessNo;
	}

	public String getWallet() {
		return wallet;
	}

	public void setWallet(String wallet) {
		this.wallet = wallet;
	}

	public String getGxsNum() {
		return gxsNum;
	}

	public void setGxsNum(String gxsNum) {
		this.gxsNum = gxsNum;
	}

	public String getGuessValue() {
		return guessValue;
	}

	public void setGuessValue(String guessValue) {
		this.guessValue = guessValue;
	}

	public String getGuessDate() {
		return guessDate;
	}

	public void setGuessDate(String guessDate) {
		this.guessDate = guessDate;
	}

	public String getGuessTerm() {
		return guessTerm;
	}

	public void setGuessTerm(String guessTerm) {
		this.guessTerm = guessTerm;
	}

	public String getGuessStatus() {
		return guessStatus;
	}

	public void setGuessStatus(String guessStatus) {
		this.guessStatus = guessStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
