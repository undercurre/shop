<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UserServlet?action=login" method="post">
		用户名：<input type="text" name="loginName" value=""/> <br/>
		密码：<input type="password" name="pass" value=""/> <br/>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>