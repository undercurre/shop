<%@page import="www.yq.com.cn.utils.Page"%>
<%@page import="www.yq.com.cn.dao.po.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<style type="text/css">
table, h1 {
	text-align: center;
	margin: auto;
}
</style>
</head>
<body>
	<h1>
		欢迎${user.loginName }来到购物天堂 <a href="add.jsp">添加</a>
	</h1>
	<table border="1" cellspacing="" cellpadding="" width="1000">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>账号</th>
			<th>密码</th>
			<th>邮箱</th>
			<th>图片路径</th>
			<th>出生日期</th>
			<th>操作</th>
		</tr>
	<%
		/* Atl+/  */
		Page<User> pageUser  =  (Page<User>)session.getAttribute("pageUser");
			if(pageUser==null){
				response.sendRedirect("UserServlet?action=page");
				return;
			}
			List<User> users = pageUser.getLists();
			int currentPage = pageUser.getCurrentPage();
			int totalPage = pageUser.getTotalPage();
			int totalCount = pageUser.getTotalCount();
			for(User u : users){
	%>	
			<tr>
				<td><%=u.getId() %></td>
				<td><%=u.getMyName() %></td>
				<td><%=u.getSex() %></td>
				<td><%=u.getLoginName()%></td>
				<td><%=u.getPass()%></td>
				<td><%=u.getEmail() %></td>
				<td> <img alt="" src="upload/<%=u.getUserImg()%>">   </td>
				<td><%=u.getBornDay() %></td>
				<td><a href="UserServlet?action=delete&id=<%=u.getId()%>" onclick=" return confirm('确定要删除该用户吗？')">删除</a>|<a href="UserServlet?action=getById&id=<%=u.getId()%>">修改</a></td>
			</tr>
	<%
			}
	%>
	</table>
	<h1>
		<a href="UserServlet?action=page&currentPage=1">首页</a>
		<a href="UserServlet?action=page&currentPage=<%=currentPage-1<1?1:currentPage-1%>">上一页</a>
		<a href="UserServlet?action=page&currentPage=<%=currentPage+1>totalPage?totalPage:currentPage+1%>">下一页</a>
		<a href="UserServlet?action=page&currentPage=<%=totalPage%>">尾页</a>
		<span><%=currentPage %>/<%=totalPage %> 总共<%=totalCount %>条</span>
	
	</h1>
</body>
</html>
