<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8"	/>
 <title>登录成功 贵美商城</title>
 <link rel="stylesheet"	type="text/css"	href="css/global.css"	/>
 <link rel="stylesheet"	type="text/css"	href="css/layout.css"	/>
</head>
<script type="text/javascript">
//3秒钟自动跳回到主页面
function jumpIndex(){
	window.location.href="${pageContext.request.contextPath}/index.jsp";
}
window.setTimeout("jumpIndex()",3000);
</script>
<body>
	<div id="container">
		<iframe src="header.jsp" width="980" height="136" frameborder="0" scrolling="no"></iframe>	
		<p class="a_c lh24"><img src="./images/logo.jpg" alt="alt" /><br />
			祝贺 !!! <br />
			您已经成功登录！！！<br />
  	  欢迎来到 拍卖天堂</p>
		<iframe src="footer.jsp" width="980" height="150" frameborder="0" scrolling="no"></iframe>
	</div><!--container	end-->
</body>
</html>		
