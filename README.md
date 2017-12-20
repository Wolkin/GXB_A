# GXB_A
公信宝数据分析平台

# GXS_JAVA_WEB （公信宝接口封装）
## 扩展开发说明
        增加配置文件\WebContent\WEB-INF\etc\gxbapi.properties 
        接口类型和接口实现类对应关系    
        示例：getaccount = com.gxb.api.wallet.GetAccount（获取账户信息接口）文件增加记录
        定义类com.gxb.api.wallet.GetAccount继承WalletAPI
        如：public class GetAccount extends WalletAPI {
           ......
      }
      实现继承函数public void doParameter(String paraStr){}
            public String jsonObj(){}
            
### Baas-API实现接口需继承BaasAPI抽象类实现对应方法
### Wallet-API实现接口需继承WalletAPI抽象类实现对应方法
### Witness-API实现接口只需继承WitnessAPI抽象类实现对应方法
        示例：public class GetAccount extends WalletAPI {
           @Override
           ......
       }
## API说明
### 1.供应量查询
	com.gxb.web.APIRequest().GXBAPIRequest("supplyquery", "")
### 2.区块查询
	com.gxb.web.APIRequest().GXBAPIRequest("blockquery", block_height)
### 3.交易查询
	com.gxb.web.APIRequest().GXBAPIRequest("transactionquery", tx_id)
### 4.账户查询
	com.gxb.web.APIRequest().GXBAPIRequest("getaccount", account_name_or_id)
### 5.余额查询
	com.gxb.web.APIRequest().GXBAPIRequest("accountbalance", account_name_or_id)
### 6.账户头像
	com.gxb.web.APIRequest().GXBAPIRequest("accountheader", account_name)
	
## 使用说明
         实例化APIRequest类  调用GXBAPIRequest(String apiType,String parameter)
                                      apiType接口类型  parameter传入参数，多单数以,好分割
         示例（获取账户信息接口）：APIRequest test = new APIRequest();
                         test.GXBAPIRequest("getaccount","gxb-wm");
                         
### 详细使用说明参见：\src\com\gxb\test\APITest.java
         
         
#### 本程序设计主旨帮助Java和公信宝爱好者快速实现接口开发、对接                         
#### 架构会继续完善，程序设计目前支持单参数，下一步多参数及各类参数进行扩展

