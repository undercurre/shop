<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="UserServlet?action=update" method="post">
			<input type="hidden" name="id" id="" value="${user.id }" /><br/>
			账号：<input type="text" name="loginName" id="" value="${user.loginName }" /><br/>
			真名：<input type="text" name="myName" id="" value="${user.myName }" /><br/>
			密码：<input type="password" name="pass" id="" value="${user.pass }" /><br/>
			确认密码：<input type="password" name="repass" id="" value="" /><br/>
			性别：<input type="radio" name="sex" id="" value="男"  ${user.sex eq '男'?'checked':'' }  />男
				<input type="radio" name="sex" id=""  value="女"  ${user.sex eq '女'?'checked':'' } />女<br/>
			邮箱：<input type="text" name="email" id="" value="${user.email }" /><br/>
			图片：<input type="file" name=""  /><br/>
			出生日期：<input type="date" name="bornDay" id="" value="${user.bornDay }" /><br/>
			<input type="submit" value="修改"/>
</form>
</body>
</html>