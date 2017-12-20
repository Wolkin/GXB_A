package com.gxb.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Http请求特殊处理
 * @author Wolkin
 *
 */

public class HttpRequestDo {
	public HttpURLConnection connection = null;
	
	/**
	 * 构造URL连接
	 * @param strUrl
	 */
	public HttpRequestDo(String strUrl) {
		try {
			URL url = new URL(strUrl);
			//使用URL打开一个链接
			this.connection = (HttpURLConnection) url.openConnection();
			
			//允许输出流，即允许上传
			this.connection.setDoOutput(true);
			//允许输入流，即允许下载
			this.connection.setDoInput(true);
			//使用post请求
			this.connection.setRequestMethod("POST");
			//不使用缓冲
			this.connection.setUseCaches(false);
			this.connection.setConnectTimeout(5000);
			//自动执行HTTP重定向 
			//this.connection.setInstanceFollowRedirects(false);
			//application/x-javascript text/xml->xml数据 application/x-javascript->json对象 application/x-www-form-urlencoded->表单数据 application/json;charset=utf-8 -> json数据
			//设定 请求格式 json，也可以设定xml格式的
			this.connection.setRequestProperty("Content-Type","application/json");
			this.connection.connect();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * 返回URL字符串
	 * @return
	 */
	public String headerFieldURL() {
		return this.connection.getHeaderField("Location");
	}
	
	/**
	 * 返回响应代码
	 * @return
	 */
	public int responseCode() {
		int code = 0;
		
		try {
			code = this.connection.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return code;
	}
}
