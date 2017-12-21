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
		
		/*
		System.out.println("获取区块头信息 params	<block_num>");
		String strGetBlockHeader = test.GXBAPIRequest("getblockheader", "5000000");
		System.out.println(strGetBlockHeader);
		*/
		
		/*
		System.out.println("获得交易信息 params <block_num> <trx_in_block>");
		String strGetTransaction = test.GXBAPIRequest("gettransaction", "<block_num>,<trx_in_block>");
		System.out.println(strGetTransaction);
		*/
		
		/*
		System.out.println("获取区块信息  params <block_num>");
		String str1 = test.GXBAPIRequest("getblock","5360976");
		System.out.println(str1);
		*/
		
		/*
		System.out.println("根据TXID查询交易，若交易超出有效期则会返回空值 params <id>");
		String strGetRecentTransactionById = test.GXBAPIRequest("get_recent_transaction_by_id", "<id>");
		System.out.println(strGetRecentTransactionById);
		*/
		
		/*
		System.out.println("获取链属性");
		String strGetChainProperties = test.GXBAPIRequest("getchainproperties", "");
		System.out.println(strGetChainProperties);
		*/
		
		/*
		System.out.println("获取全局属性");
		String strGetGlobalProperties = test.GXBAPIRequest("getglobalproperties", "");
		System.out.println(strGetGlobalProperties);
		*/
		
		/*
		System.out.println("获取佣金比例");
		String strGetCommissionPercent = test.GXBAPIRequest("getcommissionpercent", "");
		System.out.println(strGetCommissionPercent);
		*/
		
		/*
		System.out.println("获取编译时常量");
		String strGetConfig = test.GXBAPIRequest("getconfig", "");
		System.out.println(strGetConfig);
		*/
		
		/*
		System.out.println("获取链ID");
		String strGetChainId = test.GXBAPIRequest("getchainid", "");
		System.out.println(strGetChainId);
		*/
		
		/*
		System.out.println("获取动态全局属性");
		String strGetDynamicGlobalProperties = test.GXBAPIRequest("getdynamicglobalproperties", "");
		System.out.println(strGetDynamicGlobalProperties);
		*/
		
		/*
		System.out.println("返回所有指向公钥的帐户信息 params <key>");
		String strGetKeyReferences = test.GXBAPIRequest("get_key_references", "<key>");
		System.out.println(strGetKeyReferences);
		*/
		
		/*
		System.out.println("验证公钥是否已经被注册 params <public_key>");
		String strIsPublicKeyRegistered = test.GXBAPIRequest("ispublickeyregistered", "<public_key>");
		System.out.println(strIsPublicKeyRegistered);
		*/
		
		/*
		System.out.println("通过ID获取账户信息 params <account_ids>");
		String strGetAccounts = test.GXBAPIRequest("getaccounts", "<account_ids>");
		System.out.println(strGetAccounts);
		*/
		
		/*
		System.out.println("获取符合条件的所有账户相关信息 params <names_or_ids> <subscribe>");
		String strGetFullAccounts = test.GXBAPIRequest("getfullaccounts", "<names_or_ids>,<subscribe>");
		System.out.println(strGetFullAccounts);
		*/
	}
}