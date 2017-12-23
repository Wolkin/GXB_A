<%@page import="java.util.Date"%>
<%@page import="com.gxb.web.APIRequest"%>
<%@page import="org.json.JSONObject"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
	final int targetBlockHeight = 8888888;	//目标区块高度
	String webPath = getServletContext().getRealPath("/WEB-INF/");	//WEB路径
	APIRequest test = new APIRequest(webPath);
	System.out.println(webPath);
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
			JSONObject blockObject = test.GXBAPIJSONRequest("getblock", head_block_number);
			JSONObject blockResultJSON = blockObject.getJSONObject("result");
			curr_block_id = blockResultJSON.getString("block_id");
		}
	}
%>
<!DOCTYPE html>
<html>
    <head>
        <title>公信宝-未来区块竞猜小游戏</title>
        <link rel="stylesheet" href="css/page.css" />
        <link rel="stylesheet" href="css/uikit.almost-flat.css">
		<link rel="stylesheet" href="css/components/accordion.almost-flat.css">
		<link rel="stylesheet" href="css/components/autocomplete.almost-flat.css">
		<link rel="stylesheet" href="css/components/datepicker.almost-flat.css">
		<link rel="stylesheet" href="css/components/dotnav.almost-flat.css">
		<link rel="stylesheet" href="css/components/form-advanced.almost-flat.css">
		<link rel="stylesheet" href="css/components/form-file.almost-flat.css">
		<link rel="stylesheet" href="css/components/form-password.almost-flat.css">
		<link rel="stylesheet" href="css/components/form-select.almost-flat.css">
		<link rel="stylesheet" href="css/components/htmleditor.almost-flat.css">
		<link rel="stylesheet" href="css/components/nestable.almost-flat.css">
		<link rel="stylesheet" href="css/components/notify.almost-flat.css">
		<link rel="stylesheet" href="css/components/placeholder.almost-flat.css">
		<link rel="stylesheet" href="css/components/progress.almost-flat.css">
		<link rel="stylesheet" href="css/components/search.almost-flat.css">
		<link rel="stylesheet" href="css/components/slidenav.almost-flat.css">
		<link rel="stylesheet" href="css/components/slider.almost-flat.css">
		<link rel="stylesheet" href="css/components/slideshow.almost-flat.css">
		<link rel="stylesheet" href="css/components/sortable.almost-flat.css">
		<link rel="stylesheet" href="css/components/sticky.almost-flat.css">
		<link rel="stylesheet" href="css/components/tooltip.almost-flat.css">
		<link rel="stylesheet" href="css/components/upload.almost-flat.css">
        
        <script src="js/uikit.min.js"></script>
        <script src="js/core/alert.js"></script>
		<script src="js/core/core.js"></script>
		<script src="js/core/button.js"></script>
		<!-- 
		<script src="jquery.js"></script>
		<script src="js/core/touch.js"></script>
		<script src="js/core/utility.js"></script>
		<script src="js/core/smooth-scroll.js"></script>
		<script src="js/core/scrollspy.js"></script>
		<script src="js/core/toggle.js"></script>
		<script src="js/core/dropdown.js"></script>
		<script src="js/core/grid.js"></script>
		<script src="js/core/modal.js"></script>
		<script src="js/core/nav.js"></script>
		<script src="js/core/offcanvas.js"></script>
		<script src="js/core/switcher.js"></script>
		<script src="js/core/tab.js"></script>
		<script src="js/core/cover.js"></script>
		 -->

<script language="javascript">
	function guessClick()
	{
		var guessWallet = document.guessForm.guessWallet.value;
		var guessValue = document.guessForm.guessValue.value;
		var gxsNum = document.guessForm.gxsNum.value;
		if (typeof(guessWallet) == "undefined" || guessWallet == null || guessWallet == "") {
			alert("请输入参与竞猜的钱包账户");
			return;
		}
		if (typeof(guessValue) == "undefined" || guessValue == null || guessValue == "") {
			alert("请输入竞猜值");
			return;
		}
		var url = "https://wallet.gxb.io/#/transfer/?from="+trim(guessWallet)+"&to=gxb-wm&amount="+gxsNum+"&memo="+gxsNum;
		if (confirm("您的竞猜信息： \n 竞猜钱包账户["+trim(guessWallet)+"]、竞猜数值["+guessValue+"]、投注金额["+gxsNum+" gxs]\n 确认投注将跳转到转账页面")) {
			window.open(url);
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
                    </div>
                    <div class="uk-navbar-content">
                    	<img alt="28x28" src="images/logo-gxs-blue32x32.png"></img>
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
	    		<h4>本期竞猜公信宝区块高度<font color="red"><%=targetBlockHeight %></font>区块哈希码从右起第<font color="red">8</font>位值<font color="blue">（0-9,a-z）。</font></h4>
				<p>
				<h4>投注<font color="red">（1-5）</font>GXS，赔率<font color="red">5</font>倍，下注后将GXS转入庄家钱包为有效押注，公布结果后压中的庄家会自动按照赔付倍率转入您钱包，信誉至上。</h4>
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
                <form name="guessForm" class="uk-form uk-margin uk-container-center">
                	<input name="guessWallet" placeholder="竞猜账户" class="uk-margin-small-top">
	    			<input name="guessValue" maxlength="1" onkeyup="this.value=this.value.replace(/[^0-9a-zA-Z]/g,'')" placeholder="竞猜值" class="uk-margin-small-top" style="width:70px;">
                    <select name="gxsNum" class="uk-margin-small-top">
                        <option value="1">1 GXS</option>
                        <option value="2">2 GXS</option>
                        <option value="3" selected="selected">3 GXS</option>
                        <option value="4">4 GXS</option>
                        <option value="5">5 GXS</option>
                    </select>
                    <button  class="uk-button uk-button-primary uk-margin-small-top" onclick="guessClick()">投注转账</button>
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
	                        <th>竞猜用户</th>
	                        <th>下注数目</th>
	                        <th>竞猜值</th>
	                        <th>竞猜日期</th>
	                        <th>投注状态</th>
	                    </tr>
	                </thead>
	                <tbody>
	                    <tr>
	                        <td>gxs-**m</td>
	                        <td>5 gxs</td>
	                        <td>z</td>
	                        <td>2017/12/21 15:31:00</td>
	                        <td>生效</td>
	                    </tr>
	                    <tr>
	                        <td>gxs-**mm</td>
	                        <td>5 gxs</td>
	                        <td>a</td>
	                        <td>2017/12/21 15:31:00</td>
	                        <td>生效</td>
	                    </tr>
	                    <tr>
	                        <td>gxs-**m2</td>
	                        <td>3 gxs</td>
	                        <td>z</td>
	                        <td>2017/12/21 15:31:00</td>
	                        <td>失效</td>
	                    </tr>
	                    <tr>
	                        <td>mal**mll</td>
	                        <td>3 gxs</td>
	                        <td>7</td>
	                        <td>2017/12/20 15:31:00</td>
	                        <td>生效</td>
	                    </tr>
	                    <tr>
	                        <td>mal**mll</td>
	                        <td>3 gxs</td>
	                        <td>7</td>
	                        <td>2017/12/20 15:31:00</td>
	                        <td>生效</td>
	                    </tr>
	                    <tr>
	                        <td>mal**mll</td>
	                        <td>3 gxs</td>
	                        <td>7</td>
	                        <td>2017/12/20 15:31:00</td>
	                        <td>失效</td>
	                    </tr>
	                </tbody>
	            </table>
				<p>
            </div>
        </div>
        <p></p>
    </body>
</html>