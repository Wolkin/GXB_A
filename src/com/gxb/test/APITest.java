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
		
		/*
		System.out.println("��ȡ����ͷ��Ϣ params	<block_num>");
		String strGetBlockHeader = test.GXBAPIRequest("getblockheader", "5000000");
		System.out.println(strGetBlockHeader);
		*/
		
		/*
		System.out.println("��ý�����Ϣ params <block_num> <trx_in_block>");
		String strGetTransaction = test.GXBAPIRequest("gettransaction", "<block_num>,<trx_in_block>");
		System.out.println(strGetTransaction);
		*/
		
		/*
		System.out.println("��ȡ������Ϣ  params <block_num>");
		String str1 = test.GXBAPIRequest("getblock","5360976");
		System.out.println(str1);
		*/
		
		/*
		System.out.println("����TXID��ѯ���ף������׳�����Ч����᷵�ؿ�ֵ params <id>");
		String strGetRecentTransactionById = test.GXBAPIRequest("get_recent_transaction_by_id", "<id>");
		System.out.println(strGetRecentTransactionById);
		*/
		
		/*
		System.out.println("��ȡ������");
		String strGetChainProperties = test.GXBAPIRequest("getchainproperties", "");
		System.out.println(strGetChainProperties);
		*/
		
		/*
		System.out.println("��ȡȫ������");
		String strGetGlobalProperties = test.GXBAPIRequest("getglobalproperties", "");
		System.out.println(strGetGlobalProperties);
		*/
		
		/*
		System.out.println("��ȡӶ�����");
		String strGetCommissionPercent = test.GXBAPIRequest("getcommissionpercent", "");
		System.out.println(strGetCommissionPercent);
		*/
		
		/*
		System.out.println("��ȡ����ʱ����");
		String strGetConfig = test.GXBAPIRequest("getconfig", "");
		System.out.println(strGetConfig);
		*/
		
		/*
		System.out.println("��ȡ��ID");
		String strGetChainId = test.GXBAPIRequest("getchainid", "");
		System.out.println(strGetChainId);
		*/
		
		/*
		System.out.println("��ȡ��̬ȫ������");
		String strGetDynamicGlobalProperties = test.GXBAPIRequest("getdynamicglobalproperties", "");
		System.out.println(strGetDynamicGlobalProperties);
		*/
		
		/*
		System.out.println("��������ָ��Կ���ʻ���Ϣ params <key>");
		String strGetKeyReferences = test.GXBAPIRequest("get_key_references", "<key>");
		System.out.println(strGetKeyReferences);
		*/
		
		/*
		System.out.println("��֤��Կ�Ƿ��Ѿ���ע�� params <public_key>");
		String strIsPublicKeyRegistered = test.GXBAPIRequest("ispublickeyregistered", "<public_key>");
		System.out.println(strIsPublicKeyRegistered);
		*/
		
		/*
		System.out.println("ͨ��ID��ȡ�˻���Ϣ params <account_ids>");
		String strGetAccounts = test.GXBAPIRequest("getaccounts", "<account_ids>");
		System.out.println(strGetAccounts);
		*/
		
		/*
		System.out.println("��ȡ���������������˻������Ϣ params <names_or_ids> <subscribe>");
		String strGetFullAccounts = test.GXBAPIRequest("getfullaccounts", "<names_or_ids>,<subscribe>");
		System.out.println(strGetFullAccounts);
		*/
	}
}