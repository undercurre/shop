package www.yq.com.cn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����ӷ�������ת���ͻ��˵�����
		response.setContentType("text/html; charset=UTF-8");
		//�ӷ��������䵽�ͻ��˲���������
		response.setCharacterEncoding("utf-8");
		response.getWriter().write("�Ұ������й�����");
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
