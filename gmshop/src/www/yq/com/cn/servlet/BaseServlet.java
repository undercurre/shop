package www.yq.com.cn.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet {
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		//���봦��
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String action = request.getParameter("action");
		if (action==null||"".equals(action)) {
			response.getWriter().write("���ύ�ǵķǷ����ݣ���");
			return;
		}
		try {
			//���䣺������δ����ȷ�������顣 ���������action����ͨ��������Ƶõ�������Ķ�Ӧ��������
			Method  method  = this.getClass().getMethod(action, HttpServletRequest.class,HttpServletResponse.class);
			//ʹ�÷�������method���ñ�����ķ���
			method.invoke(this, request,response);
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("���ύ�ǵķǷ����ݣ���");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
