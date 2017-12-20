package com.gxb.api.baas;

import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * 统计查询信息接口
 * @author Wolkin
 *
 */

public abstract class BaasAPI implements APIObj{

	/**
	 * 打包接口反馈信息
	 */
	@Override
	public abstract JSONObject jsonObj();

	/**
	 * 参数处理
	 */
	@Override
	public abstract void doParameter(String paraStr);
}
