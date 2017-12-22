package com.gxb.dao;

import com.gxb.dao.impl.GuessDAOImpl;
/**
 * Describe：DAO工厂，有效避免由于DAO实现改变导致的大量代码修改
 * @author wlma
 * 
 */
public class DAOFactory {

	public static GuessDAO getGuessDAOImpl() {
		return new GuessDAOImpl();
	}
}
