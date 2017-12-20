package com.gxb.test;

import com.gxb.web.APIRequest;

public class APITest {

	public static void main(String[] args) {
		APIRequest test = new APIRequest();
		String str = test.GXBAPIRequest("getaccount","1.2.21446");
		System.out.println(str);
	}
}