package com.gxb.web;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.Properties;

import org.json.JSONException;
import org.json.JSONObject;

import com.gxb.api.APIObj;
import com.gxb.util.HttpRequestDo;

/**
 * Describe：API接口对象
 * @author Wolkin
 *
 */

public class APIRequest {
	public static final String ADD_URL = "https://node1.gxb.io/";
	public static String propertiesFile = "etc/gxbapi.properties";
	public static HttpURLConnection connection = null;
	public static Properties apiProperties = null;
	APIObj apiObj = null;
	
	public APIRequest() {
		try {
			String path = this.getClass().getResource("/").getPath();
            path = path.substring(1, path.indexOf("classes"));
			File file = new File(path + propertiesFile);
			InputStream inputStream = new FileInputStream(file);
			apiProperties = new Properties();
			apiProperties.load(inputStream);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * servlet调用需传入WEN-INF的路径
	 * @param webPath
	 */
	public APIRequest(String webPath) {
		try {
			this.propertiesFile = webPath + "/" + propertiesFile;
			File file = new File(propertiesFile);
			InputStream inputStream = new FileInputStream(file);
			apiProperties = new Properties();
			apiProperties.load(inputStream);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param apiType
	 * @param parameter,多个参数以逗号按顺序分割
	 * @return
	 */
	public String GXBAPIRequest(String apiType,String parameter) {
		String returnStr = "";
		APIObj apiObj = null;
		StringBuffer buffer = new StringBuffer();
		HttpRequestDo httpDo = null;
		String apiType_1 = apiProperties.getProperty(apiType);
		if(apiType_1 == null || "".equals(apiType_1)) {
			System.out.println("API Type is not find! Please check is.");
			returnStr = "failed";
			return returnStr;
		}
		
		try {
			
			Class c = Class.forName(apiType_1);
			apiObj = (APIObj) c.newInstance();
			apiObj.doParameter(parameter);
			JSONObject obj = apiObj.jsonObj();
			
			httpDo = new HttpRequestDo(ADD_URL);
			
			DataOutputStream out = new DataOutputStream(httpDo.connection.getOutputStream());
			out.writeBytes(obj.toString());
            out.flush();
            out.close();
            
			if(httpDo.responseCode() == 200) {
				InputStream inputStream = httpDo.connection.getInputStream();
				
		        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
		        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		    
		        String str = "";
		        while ((str = bufferedReader.readLine()) != null) {
		        	buffer.append(str);
		        }
		        // 释放资源    
		        returnStr = buffer.toString();
		        bufferedReader.close();
		        inputStreamReader.close();
		        
		        inputStream.close();
		        inputStream = null;
			}
	       
	        httpDo.connection.disconnect();
	        
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return returnStr;
	}

	public JSONObject GXBAPIJSONRequest(String apiType, String parameter) {
		try {
			return new JSONObject(this.GXBAPIRequest(apiType, parameter));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}