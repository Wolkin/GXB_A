package com.gxb.test;

import com.gxb.web.APIRequest;

public class APITest {

	public static void main(String[] args) {
		APIRequest test = new APIRequest();
		String str1 = test.GXBAPIRequest("blockquery","5360976");
		System.out.println(str1);
		
		//String str = test.GXBAPIRequest("getaccountbalances","1.2.26");
		//System.out.println(str);
	}
}