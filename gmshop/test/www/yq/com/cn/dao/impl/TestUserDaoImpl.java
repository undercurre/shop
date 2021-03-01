package www.yq.com.cn.dao.impl;

import java.util.Date;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;

import www.yq.com.cn.dao.IUserDao;
import www.yq.com.cn.dao.po.User;
import www.yq.com.cn.utils.Page;

public class TestUserDaoImpl {
	public static void main(String[] args) {
//		//测试查询全部用户
//		IUserDao userDao = new UserDaoImpl();
//		List<User> users = userDao.listAll();
//		for (User user : users) {
//			System.out.println(user);
//		}
		
//		//测试根据Id查询一个用户信息
//		IUserDao userDao = new UserDaoImpl();
//		User user = userDao.getById(6);
//		System.out.println(user);
//		
//		//登录功能
//		IUserDao userDao = new UserDaoImpl();
//		User user =userDao.loing("tom", "123");
//		if (user!=null) {
//			System.out.println("登录成功！！");
//		} else {
//			System.out.println("登录失败！！");
//		}
		
//		//测试根据ID删除
//		
//		IUserDao userDao = new UserDaoImpl();
//		int rows = userDao.deleteById(31);
//		System.out.println(rows);
//		
		//测试添加操作
//		IUserDao userDao = new UserDaoImpl();
//		for (int i = 0; i < 100; i++) {
//			User user = new User("张德政", "zd4562"+i, "111", "zdz@qq.com", "男", "xxx.jpg", new Date());
//			int rows = userDao.save(user);
//			System.out.println(rows);
//		}
		
		
		//修改操作
//		IUserDao userDao = new UserDaoImpl();
//		//User user = userDao.getById(29);
//		//user.setEmail("test@qq.com");
//		User user = new User(19,"张德政222", "zdz9832", "111", "zdz@qq.com", "男", "xxx.jpg", new Date());
//		int rows = userDao.update(user);
//		System.out.println(rows);
		
//		//测试得到总记录条数
//		
//		IUserDao userDao = new UserDaoImpl();
//		int totalCount = userDao.getTotalCount();
//		System.out.println(totalCount);
		
//		//得到一页中的详细信息
//		
//		IUserDao userDao = new UserDaoImpl();
//		List<User> onePageUsers = userDao.getOnePageInfo(3, 50);
//		for (User user : onePageUsers) {
//			System.out.println(user);
//		}

		//这里是北京
		int currentPage = 4;
		int pageSize = 10;
		IUserDao userDao = new UserDaoImpl();
		int totalCount = userDao.getTotalCount();
		List<User> lists = userDao.getOnePageInfo(currentPage, pageSize);
		//封装pageUser
		Page<User> pageUser = new Page<User>(currentPage, totalCount, pageSize, lists);
		
		//佛山
		//一切数据从Page中拿
		System.out.println("第"+pageUser.getCurrentPage()+"页.");
		System.out.println("每页"+pageUser.getPageSize()+"条数据！");
		System.out.println("总共"+pageUser.getTotalPage()+"页！！");
		System.out.println("总共有"+pageUser.getTotalCount()+"条记录。");
		System.out.println("一页中的详细信息。");
		List<User> onePageUsers = pageUser.getLists();
		for (User user : onePageUsers) {
			System.out.println(user);
		}
		
		
		
	}
}
