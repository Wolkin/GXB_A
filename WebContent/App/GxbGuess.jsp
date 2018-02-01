<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/IncludeHead.jsp" %>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.gxb.dao.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Date"%>
<%@page import="com.gxb.web.APIRequest"%>
<%@page import="org.json.JSONObject"%>
<%
	final int targetBlockHeight = 8888888;	//目标区块高度
	APIRequest test = new APIRequest();
	/* 获取全局区块信息，提取最新区块高度  */
	JSONObject headObject = test.GXBAPIJSONRequest("getdynamicglobalproperties", "");
	JSONObject headResultJSON = headObject.getJSONObject("result");
	String head_block_number = "获取失败";
	double percent = 0.0;
	if (headResultJSON != null) {
		head_block_number = headResultJSON.getString("head_block_number");
		System.out.println(head_block_number);
	}
	String curr_block_id = "尚未开奖";
	if (!"获取失败".equals(head_block_number)) {
		double curr_block_number = Double.valueOf(head_block_number).doubleValue();
		percent = curr_block_number * 100 / targetBlockHeight;
		if (percent > 100.0) {
			percent = 100.0;
		}
		/* 最新区块高度大于目标区块高度，查询目标区块信息，获取目标区块哈希值block_id */
		if (curr_block_number >= targetBlockHeight) {	//可以开奖了
			String temp = String.valueOf(targetBlockHeight); //转换目标区块为字符串
			
			JSONObject blockObject = test.GXBAPIJSONRequest("getblock", temp);
			JSONObject blockResultJSON = blockObject.getJSONObject("result");
			curr_block_id = blockResultJSON.getString("block_id");
		}
	}
	
	/* 投注纪录展示 */
	ResultSet rs = null;
	Connection conn = new DBConnection().getConnection();
	Statement stat;
%>
<!DOCTYPE html>
<html>
    <head>
        <title>公信宝-未来区块竞猜小游戏</title>
<script language="javascript">

	function guessClick()
	{
		var guessWallet = document.getElementById("guessForm").guessWallet.value;
		var guessValue = document.getElementById("guessForm").guessValue.value;
		var gxsNum = document.getElementById("guessForm").gxsNum.value;
		if (typeof(guessWallet) == "undefined" || guessWallet == null || guessWallet == "") {
			alert("请输入参与竞猜的钱包账户");
			return;
		}
		if (typeof(guessValue) == "undefined" || guessValue == null || guessValue == "") {
			alert("请输入竞猜值");
			return;
		}
		var url = "https://wallet.gxb.io/#/transfer/?from="+trim(guessWallet)+"&to=gxb-wm&amount="+gxsNum+"&memo="+gxsNum;
		if (confirm("您的竞猜信息： \n 竞猜钱包账户【"+trim(guessWallet)+"】、竞猜数值【"+guessValue+"】、投注金额【"+gxsNum+" gxs】\n 确认投注将跳转到转账页面")) {
			//document.getElementById("guessForm").method="POST";
			//document.getElementById("guessForm").action="/GXB_A/GuessRecordInsert";
			//document.getElementById("guessForm").submit();
			$("form#guessForm").on('submit',function(e){
			    e.preventDefault();
			    $.ajax({
			        type:"post",
			        url:"/GXB_A/GuessRecordInsert",
			        data:{
			        	guessWallet:trim(guessWallet),
			        	guessValue:trim(guessValue),
			        	gxsNum:trim(gxsNum)
			        },
			        success:function (data) {
			            window.open(url);
			            location.reload();
			        }
			    });
			})
		}
	}

	//去左空格;
	function ltrim(s)
	{
	    return s.replace(/(^\s*)/g, "");
	}
	//去右空格;
	function rtrim(s)
	{
	    return s.replace(/(\s*$)/g, "");
	}
	//去左右空格;
	function trim(s)
	{
	    return s.replace(/(^\s*)|(\s*$)/g, "");
	}
</script>
    </head>
    <body>
    	<p></p>
    	<div class="uk-container uk-container-center">
            <div class="uk-margin">
                <nav class="uk-navbar">
                    <div class="uk-navbar-flip">
                    	<!-- 
                        <ul class="uk-navbar-nav uk-hidden-small">
                            <li class="uk-parent" data-uk-dropdown="" aria-haspopup="true" aria-expanded="false">
                                <a href="http://www.getuikit.net/tests/core/navbar.html">Parent</a>
                                <div class="uk-dropdown uk-dropdown-navbar">
                                    <ul class="uk-nav uk-nav-navbar">
                                        <li><a href="http://www.getuikit.net/tests/core/navbar.html#">Item</a></li>
                                        <li><a href="http://www.getuikit.net/tests/core/navbar.html#">Another item</a></li>
                                        <li><a href="http://getuikit.com/">External</a></li>
                                        <li class="uk-nav-header">Header</li>
                                        <li><a href="http://www.getuikit.net/tests/core/navbar.html#">Item</a></li>
                                        <li><a href="http://www.getuikit.net/tests/core/navbar.html#">Another item</a></li>
                                        <li class="uk-nav-divider"></li>
                                        <li><a href="http://www.getuikit.net/tests/core/navbar.html#">Separated item</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li><a href="http://www.getuikit.net/tests/core/navbar.html">Item</a></li>
                            <li class="uk-active"><a href="http://www.getuikit.net/tests/core/navbar.html">Active</a></li>
                        </ul>
                        -->
                    </div>
                    <div class="uk-navbar-content">
                    	<img alt="28x28" src="<%=contentPath%>/images/logo-gxs-blue32x32.png"></img>
                    	&nbsp;<font><strong>公信宝-未来区块竞猜小游戏</strong></font>
                    </div>

                </nav>

            </div>

        </div>

		<!-- 竞猜说明区域 -->
		<div class="uk-container uk-container-center">
			
			<div class="uk-panel uk-panel-box uk-panel-box-secondary">
				<!-- 
                <div class="uk-panel-badge uk-badge uk-badge-danger">Top</div>
                 -->
                <h3 class="uk-panel-title"><strong>竞猜说明</strong></h3>
                <p>
	    		<h4>本期竞猜公信宝区块高度<font color="red"><%=targetBlockHeight %></font>区块哈希码从右起第<font color="red">8</font>位值<font color="blue">（0-9,a-f）。</font></h4>
				<p>
				<h4>投注<font color="red">（1-5）</font>GXS，赔率<font color="red">8</font>倍，下注后将GXS转入庄家钱包为有效押注，公布结果后压中的庄家会自动按照赔付倍率转入您钱包，信誉至上。</h4>
				<p>
				<h4>庄家钱包地址：<font color="red"><strong>gxb-wm</strong></font></h4>
            </div>
		</div>
		<p></p>
		<!-- 竞猜区域 -->
        <div class="uk-container uk-container-center">
        	<div class="uk-panel uk-panel-box uk-panel-box-secondary" >
                <div class="uk-panel-badge uk-badge uk-badge-danger ">Hot</div>
                <h3 class="uk-panel-title"><strong>竞猜区</strong></h3>
                <div class="uk-text-center">
                <form id="guessForm" class="uk-form uk-margin uk-container-center">
                	<label for="guessWallet">竞猜账户：</label>
                	<input id="guessWallet" name="guessWallet" placeholder="竞猜账户" class="uk-margin-small-top">
	    			<label for="guessValue">竞猜值：</label>
	    			<input id="guessValue" name="guessValue" maxlength="1" onkeyup="this.value=this.value.replace(/[^0-9a-zA-Z]/g,'')" placeholder="竞猜值" class="uk-margin-small-top" style="width:70px;">
                    <select name="gxsNum" class="uk-margin-small-top">
                        <option value="1">1 GXS</option>
                        <option value="2">2 GXS</option>
                        <option value="3" selected="selected">3 GXS</option>
                        <option value="4">4 GXS</option>
                        <option value="5">5 GXS</option>
                    </select>
                    <button class="uk-button uk-button-primary uk-margin-small-top" onclick="guessClick()">投注转账</button>
                    <!-- 
               		<a class="uk-button uk-button-danger" href="https://wallet.gxb.io/#/transfer/?to=gxb-wm">投注转账</a>
					 -->
				</form>
				</div>
            </div>
		</div>
		<div id="notice" style="display: none;" class="uk-container uk-container-center">
			<div class="uk-alert" data-uk-alert="">
				<a href="#" class="uk-alert-close uk-close"></a>
				<p>竞猜结果登记成功，请尽快完成转账.</p>
	        </div>
        </div>
        <p></p>
        <!-- 开奖区域 -->
        <div class="uk-container uk-container-center">
        	<div class="uk-panel uk-panel-box uk-panel-box-secondary">
        		<div class="uk-panel-badge uk-badge uk-badge-danger">Hot</div>
        		<a href="" class="uk-comment-avatar uk-icon-spin uk-icon-diamond uk-icon-large" ></a>
        		<!-- 
				<img class="uk-comment-avatar" src="images/logo-gxs-blue48x48.png" alt="48x48" data-src="holder.js/50x50/auto" data-holder-rendered="true">
				 -->
<%
	if ("尚未开奖".equals(curr_block_id)) {
%>
				<h4 class="uk-comment-title"><strong>当前区块高度：<%=head_block_number%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;区块高度<%=targetBlockHeight %>的哈希值：<%=curr_block_id%></strong></h4>
				<p class="uk-comment-meta"><%=new Date()%></p>
<%		
	} else {
%>
				<h4 class="uk-comment-title"><strong>当前区块高度：<%=head_block_number%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;区块高度<%=targetBlockHeight %>的哈希值：<%=curr_block_id.substring(0, curr_block_id.length()-8)%><font size="6" color="red"><%=curr_block_id.substring(curr_block_id.length()-8, curr_block_id.length()-7)%></font><%=curr_block_id.substring(curr_block_id.length()-7)%></strong></h4>
<%	
	}
%>
				<div class="uk-progress">
               		<div class="uk-progress-bar" style="width: <%=percent%>%;"><%=head_block_number%> / <%=targetBlockHeight %> (<strong><%=percent%>%</strong>)</div>
           		</div>
	    	</div>
        </div>
        <p></p>
        <div class="uk-container uk-container-center">
        	<div class="uk-panel uk-panel-box uk-panel-box-secondary">
                <div class="uk-panel-badge uk-badge">New</div>
                <h3 class="uk-panel-title"><strong>竞猜记录</strong></h3>
                <p>
	    		<table class="uk-table uk-table-hover uk-table-condensed">
	                <thead>
	                    <tr>
	                        <th>竞猜账户</th>
	                        <th>下注数目</th>
	                        <th>竞猜值</th>
	                        <th>竞猜日期</th>
	                        <th>投注状态</th>
	                    </tr>
	                </thead>
	                <tbody>
<%
	try {
		stat = conn.createStatement();
		String sql = " select wallet,gxsNum,guessValue,guessDate,guessTerm,guessStatus" +
				" from guessrecord" +
				" where guessTerm = '2017001'" +
				" order by guessDate desc";
		rs = stat.executeQuery(sql);
		String guessStatus = "";
		while (rs.next()) {
			guessStatus = rs.getString("guessStatus");
			if ("0".equals(guessStatus)) {
				guessStatus = "新发生";
			} else if ("1".equals(guessStatus)) {
				guessStatus = "生效";
			} else {
				guessStatus = "失效";
			}
%>
						<tr>
	                        <td><%=rs.getString("wallet") %></td>
	                        <td><%=rs.getString("gxsNum") %> gxs</td>
	                        <td><%=rs.getString("guessValue") %></td>
	                        <td><%=rs.getString("guessDate") %></td>
	                        <td><%=guessStatus %></td>
	                    </tr>
<%
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>
	                </tbody>
	            </table>
				<p>
            </div>
        </div>
        <p></p>
    </body>
</html>