package www.yq.com.cn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/OrderServlet")
public class OrderServlet extends BaseServlet {
	public void add(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("����OrderServletadd����");
	}
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("����OrderServletdelete����");
	}
	public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("����OrderServletupdate����");
	}
	public void listAll(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("����OrderServletlistAll����");
	}
}
