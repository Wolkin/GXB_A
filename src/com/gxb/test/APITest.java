package com.gxb.test;

import com.gxb.web.APIRequest;

public class APITest {

	public static void main(String[] args) {
		APIRequest test = new APIRequest();
		/*
		System.out.println("����ID��ѯĿ����� params <ids>");
		String strGetObjects = test.GXBAPIRequest("getobjects", "1.25.100,1.2.200");
		System.out.println(strGetObjects);
		*/
		
		/*
		System.out.println("ע��ȫ�ֶ��ĵĻص� params <cb> <clear_filter>");
		String strSetSubscribeCallback = test.GXBAPIRequest("setsubscribecallback", "cb,clear_filter");
		System.out.println(strSetSubscribeCallback);
		*/
		
		/*
		System.out.println("ע�����ݽ��׵Ļص�  params <cb> <clear_filter>");
		String strSetDataTransactionSubscribeCallback = test.GXBAPIRequest("setdatatransactionsubscribecallback", "cb,clear_filter");
		System.out.println(strSetDataTransactionSubscribeCallback);
		*/
		
		/*
		System.out.println("ȡ��ע�����ݽ��׵Ļص�");
		String strUnsubscribeDataTransactionCallback = test.GXBAPIRequest("unsubscribedatatransactioncallback", "");
		System.out.println(strUnsubscribeDataTransactionCallback);
		*/
		
		/*
		System.out.println("ע���ض����ݲ�ƷID�����ݽ��׻ص� params <cb> <ids>");
		String strSetDataTransactionProductsSubscribeCallback = test.GXBAPIRequest("setdatatransactionproductssubscribecallback", "cb,ids");
		System.out.println(strSetDataTransactionProductsSubscribeCallback);
		*/
		
		/*
		System.out.println("ע��δȷ�ϵĽ��׵Ļص� params <cb>");
		String strSetPendingTransactionCallback = test.GXBAPIRequest("setpendingtransactioncallback", "cb");
		System.out.println(strSetPendingTransactionCallback);
		*/
		
		/*
		System.out.println("ע�������Ƿ�Ӧ�õĻص�	params <cb>");
		String strSetBlockAppliedCallback = test.GXBAPIRequest("setblockappliedcallback", "cb");
		System.out.println(strSetBlockAppliedCallback);
		*/
		
		/*
		System.out.println("ֹͣ���ж��ģ��ص���");
		String strCancelAllSubscriptions = test.GXBAPIRequest("cancelallsubscriptions", "");
		System.out.println(strCancelAllSubscriptions);
		*/
		
		
		System.out.println("��ȡ����ͷ��Ϣ params	<block_num>");
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