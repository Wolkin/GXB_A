package com.gxb.test;

import com.gxb.web.APIRequest;

public class APITest {

	public static void main(String[] args) {
		APIRequest test = new APIRequest();
		/*
		System.out.println("根据ID查询目标对象 params <ids>");
		String strGetObjects = test.GXBAPIRequest("getobjects", "1.25.100,1.2.200");
		System.out.println(strGetObjects);
		*/
		
		/*
		System.out.println("注册全局订阅的回调 params <cb> <clear_filter>");
		String strSetSubscribeCallback = test.GXBAPIRequest("setsubscribecallback", "cb,clear_filter");
		System.out.println(strSetSubscribeCallback);
		*/
		
		/*
		System.out.println("注册数据交易的回调  params <cb> <clear_filter>");
		String strSetDataTransactionSubscribeCallback = test.GXBAPIRequest("setdatatransactionsubscribecallback", "cb,clear_filter");
		System.out.println(strSetDataTransactionSubscribeCallback);
		*/
		
		/*
		System.out.println("取消注册数据交易的回调");
		String strUnsubscribeDataTransactionCallback = test.GXBAPIRequest("unsubscribedatatransactioncallback", "");
		System.out.println(strUnsubscribeDataTransactionCallback);
		*/
		
		/*
		System.out.println("注册特定数据产品ID的数据交易回调 params <cb> <ids>");
		String strSetDataTransactionProductsSubscribeCallback = test.GXBAPIRequest("setdatatransactionproductssubscribecallback", "cb,ids");
		System.out.println(strSetDataTransactionProductsSubscribeCallback);
		*/
		
		/*
		System.out.println("注册未确认的交易的回调 params <cb>");
		String strSetPendingTransactionCallback = test.GXBAPIRequest("setpendingtransactioncallback", "cb");
		System.out.println(strSetPendingTransactionCallback);
		*/
		
		/*
		System.out.println("注册区块是否被应用的回调	params <cb>");
		String strSetBlockAppliedCallback = test.GXBAPIRequest("setblockappliedcallback", "cb");
		System.out.println(strSetBlockAppliedCallback);
		*/
		
		/*
		System.out.println("停止所有订阅（回调）");
		String strCancelAllSubscriptions = test.GXBAPIRequest("cancelallsubscriptions", "");
		System.out.println(strCancelAllSubscriptions);
		*/
		
		
		System.out.println("获取区块头信息 params	<block_num>");
		String strGetBlockHeader = test.GXBAPIRequest("getblockheader", "5000000");
		System.out.println(strGetBlockHeader);
		
		/*
		String str1 = test.GXBAPIRequest("blockquery","5360976");
		System.out.println(str1);
		*/
		//String str = test.GXBAPIRequest("getaccountbalances","1.2.26");
		//System.out.println(str);
	}
}