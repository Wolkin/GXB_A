package com.gxb.dao;

import com.gxb.dao.impl.GuessDAOImpl;
/**
 * Describe��DAO��������Ч��������DAOʵ�ָı䵼�µĴ��������޸�
 * @author wlma
 * 
 */
public class DAOFactory {

	public static GuessDAO getGuessDAOImpl() {
		return new GuessDAOImpl();
	}
}
