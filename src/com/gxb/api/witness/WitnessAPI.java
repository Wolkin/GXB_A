package com.gxb.api.witness;

import com.gxb.api.APIObj;

/**
 * 定义见证信息接口抽象类
 * @author Wolkin
 *
 */

public abstract class WitnessAPI  implements APIObj{

	@Override
	public abstract JSONObject jsonObj();

	/**
	 * 参数处理
	 */
	@Override
	public abstract void doParameter(String paraStr);
}
