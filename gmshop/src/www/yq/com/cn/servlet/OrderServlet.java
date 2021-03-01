package www.yq.com.cn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/OrderServlet")
public class OrderServlet extends BaseServlet {
	public void add(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("调用OrderServletadd方法");
	}
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("调用OrderServletdelete方法");
	}
	public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("调用OrderServletupdate方法");
	}
	public void listAll(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("调用OrderServletlistAll方法");
	}
}
