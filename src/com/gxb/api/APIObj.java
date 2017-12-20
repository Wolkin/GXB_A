package com.gxb.api;

import org.json.JSONObject;

/**
 * Describe：定义API接口对象
 * @author Wolkin
 * 
 */

public interface APIObj {
	
	/**
	 * 打包各个接口信息
	 * @return
	 */
	public abstract JSONObject jsonObj();
	
	/**
	 * 各个接口参数处理
	 * @param paraStr
	 */
	public abstract void doParameter(String paraStr);
}
