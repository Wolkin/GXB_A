package com.gxb.dao;

/**
 * Describe£º¾º²Â¼ÇÂ¼DAO½Ó¿Ú
 * @author wlma
 * 
 */
import com.gxb.dao.bean.GuessRecord;

public interface GuessDAO {

	public void insert(GuessRecord guessRecord) throws Exception;

	public void update(GuessRecord guessRecord) throws Exception;

	public String[][] queryAll() throws Exception;
}
