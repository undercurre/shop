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
		//乱码处理
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String action = request.getParameter("action");
		if (action==null||"".equals(action)) {
			response.getWriter().write("您提交是的非法数据！！");
			return;
		}
		try {
			//反射：可以做未来不确定的事情。 根据输入的action动作通过反射机制得到本对象的对应方法对象
			Method  method  = this.getClass().getMethod(action, HttpServletRequest.class,HttpServletResponse.class);
			//使用方法对象method调用本对象的方法
			method.invoke(this, request,response);
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("您提交是的非法数据！！");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
