<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="UserServlet?action=add" method="post">
			账号：<input type="text" name="loginName" id="" value="" /><br/>
			真名：<input type="text" name="myName" id="" value="" /><br/>
			密码：<input type="password" name="pass" id="" value="" /><br/>
			确认密码：<input type="password" name="repass" id="" value="" /><br/>
			性别：<input type="radio" name="sex" id="" value="男" checked="checked" />男
				<input type="radio" name="sex" id="" value="女" />女<br/>
			邮箱：<input type="text" name="email" id="" value="" /><br/>
			图片：<input type="file" name=""  /><br/>
			出生日期：<input type="date" name="bornDay" id="" value="" /><br/>
			<input type="submit" value="注册"/>
</form>
</body>
</html>