package www.yq.com.cn.servlet;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;

import www.yq.com.cn.dao.po.User;
import www.yq.com.cn.service.IUserService;
import www.yq.com.cn.service.impl.UserServiceImpl;
import www.yq.com.cn.utils.Page;
@WebServlet("/UserServlet")
public class UserServlet extends BaseServlet {
	IUserService userService = new UserServiceImpl();
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myName = null;
		String loginName = null;
		String pass = null;
		String email =  null;
		String sex =  null;
		String bornDayStr = null;
		String onlyName = null;
		//1.收集数据
		//先判断是否是以enctype="multipart/form-data"这个方式提交
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if (isMultipart) {
			//得到文件上传的对象
			FileItemFactory fileItemFactory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
			//得到表单控件
			try {
				List<FileItem> items =  upload.parseRequest(request);
				for (FileItem fileItem : items) {
					//判断是否是普通表单控件，和文件上传控件
					boolean isform = fileItem.isFormField();
					if (isform) {//普通表单控件
						String inputName=fileItem.getFieldName();
						if (inputName.equals("myName")) {
							myName = fileItem.getString("utf-8");
							System.out.println(myName);
						}
						if (inputName.equals("loginName")) {
							loginName = fileItem.getString("utf-8");
							System.out.println(loginName);
						}
						if (inputName.equals("pass")) {
							pass = fileItem.getString("utf-8");
							System.out.println(pass);
						}
						if (inputName.equals("email")) {
							email = fileItem.getString("utf-8");
							System.out.println(email);
						}
						if (inputName.equals("sex")) {
							sex = fileItem.getString("utf-8");
							System.out.println(sex);
						}
						if (inputName.equals("bornDay")) {
							bornDayStr = fileItem.getString("utf-8");
							System.out.println(bornDayStr);
						}
					} else {
						//文件上传控件
						//得到文件名
						String fileName = fileItem.getName();
						System.out.println(fileName);
						//把文件名重命名为全球唯一
						String uuid = UUID.randomUUID().toString();
						//得到文件名的扩展名  .jpg
						String extendsName = fileName.substring(fileName.lastIndexOf("."), fileName.length());
						onlyName = uuid + extendsName;//数据库也是保存这个图片名字
						//把图片保存到 C:/apache-tomcat-8.0.50/webapps/gmshop/upload
						//得服务器的图片保存路径
						ServletContext application = this.getServletContext();
						String serverPath = application.getRealPath("upload");
						//文件上传
						File file = new File(serverPath, onlyName) ;
						try {
							fileItem.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
		}
		
				//2.封装数据
				User user = new User();
				user.setLoginName(loginName);
				user.setMyName(myName);
				user.setPass(pass);
				user.setEmail(email);
				user.setSex(sex);
				user.setUserImg(onlyName);
				//把字符串的日期转换成日期类型
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				Date bornDay = null;
				try {
					bornDay = df.parse(bornDayStr);
				} catch (ParseException e) {
					
					e.printStackTrace();
				}
				user.setBornDay(bornDay);
				//3.调用service 层的API
				int rows = userService.save(user);
				//4.控制跳转。
				if (rows>0) {
					request.getSession().setAttribute("user", user);
					response.sendRedirect("register_success.jsp");
				} else {
					System.out.println("注册失败！！");
				}
	}
	public void delete(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int rows = userService.deleteById(Long.parseLong(idStr));
		if (rows>0) {
			response.sendRedirect("UserServlet?action=page");
		} else {
			System.out.println("删除失败！！");
		}
	}
	public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.收集数据
				String idStr = request.getParameter("id");
				String loginName = request.getParameter("loginName");
				String myName = request.getParameter("myName");
				String pass = request.getParameter("pass");
				String sex = request.getParameter("sex");
				String email = request.getParameter("email");
				//2020-07-22
				String bornDayStr = request.getParameter("bornDay");
				//2.封装数据
				User user = new User();
				user.setId(Long.parseLong(idStr));
				user.setLoginName(loginName);
				user.setMyName(myName);
				user.setPass(pass);
				user.setEmail(email);
				user.setSex(sex);
				//把字符串的日期转换成日期类型
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				Date bornDay = null;
				try {
					bornDay = df.parse(bornDayStr);
				} catch (ParseException e) {
					
					e.printStackTrace();
				}
				user.setBornDay(bornDay);
				//3.调用service 层的API
				int rows = userService.update(user);
				//4.控制跳转。
				if (rows>0) {
					response.sendRedirect("UserServlet?action=page");
				} else {
					System.out.println("修改失败！！");
				}
	}
	public void listAll(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		List<User>  users = userService.listAll();
		HttpSession session = request.getSession();
		session.setAttribute("users", users);
		response.sendRedirect("welcome.jsp");
	}
	public void getById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String idStr = request.getParameter("id");
		User user = userService.getById(Long.parseLong(idStr));
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		//假设已经从数据库中查询到一个用户信息
		response.sendRedirect("update.jsp");
	}
	public void login(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String  loginName = request.getParameter("loginName");
		String  pass = request.getParameter("pass");
		User user = userService.loing(loginName, pass);
		if (user!=null) {
			//jstl/el
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("login_success.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}
	public void page(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String  currentPageStr = request.getParameter("currentPage");
		if (currentPageStr==null) {
			currentPageStr = "1";
		}
		int pageSize = 10;
		Page<User> pageUser = userService.getPage(Integer.parseInt(currentPageStr), pageSize);
		//把数据放入到session中
		HttpSession session = request.getSession();
		session.setAttribute("pageUser", pageUser);
		//跳转的page.jsp
		response.sendRedirect("page.jsp");
	}
	
}
