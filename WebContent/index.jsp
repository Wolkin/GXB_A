<%@ include file="/IncludeHead.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<%
	String app = request.getParameter("app");
	System.out.println(app);
	System.out.println(contentPath);
	if("gxbguess".equals(app)) {
%>
<script type="text/javascript">
	window.open("<%=contentPath%>/GxbApp?app=<%=app%>","_top");
</script>
<% 
	}else{
%>
<script type="text/javascript">
	alert("URL is wrong,please check it!");
</script>
<%
	}
%>
</head>
<body>
</body>
</html>