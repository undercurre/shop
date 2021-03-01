package www.yq.com.cn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//解决从服务器端转到客户端的乱码
		response.setContentType("text/html; charset=UTF-8");
		//从服务器传输到客户端产生的乱码
		response.setCharacterEncoding("utf-8");
		response.getWriter().write("我啊您，中国！！");
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
