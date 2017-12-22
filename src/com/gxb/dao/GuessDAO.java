package com.gxb.dao;

/**
 * Describe�����¼�¼DAO�ӿ�
 * @author wlma
 * 
 */
import com.gxb.dao.bean.GuessRecord;

public interface GuessDAO {

	public void insert(GuessRecord guessRecord) throws Exception;

	public void update(GuessRecord guessRecord) throws Exception;

	public String[][] queryAll() throws Exception;
}
