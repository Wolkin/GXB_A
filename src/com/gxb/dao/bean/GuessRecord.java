package com.gxb.dao.bean;

/**
 * Describe�����¼�¼��JavaBean
 * @author wlma
 * 
 */
public class GuessRecord {

	private String guessNo;	//���±��
	private String wallet;	//����Ǯ���ʺ�
	private String gxsNum;	//ͶעGXS����
	private String guessValue;	//����ֵ
	private String guessDate;	//��������ʱ��
	private String guessTerm;	//�����ڴ�
	private String guessStatus;	//����״̬ 0-�·��� 1-��Ч 2-ʧЧ
	private String remark;	//��ע

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
