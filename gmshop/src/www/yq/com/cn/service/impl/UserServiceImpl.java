package www.yq.com.cn.service.impl;

import java.util.List;

import www.yq.com.cn.dao.IUserDao;
import www.yq.com.cn.dao.impl.UserDaoImpl;
import www.yq.com.cn.dao.po.User;
import www.yq.com.cn.service.IUserService;
import www.yq.com.cn.utils.Page;

public class UserServiceImpl implements IUserService {
	IUserDao userDao = new UserDaoImpl();
	@Override
	public List<User> listAll() {
		return userDao.listAll();
	}

	@Override
	public int deleteById(long id) {
		// TODO Auto-generated method stub
		return userDao.deleteById(id);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return userDao.update(user);
	}

	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public User getById(long id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

	@Override
	public User loing(String loginName, String pass) {
		// TODO Auto-generated method stub
		return userDao.loing(loginName, pass);
	}
	/**
	 * 封装一页中的全部信息
	 * @param currentPage  当前页码
	 * @param pageSize 每页显示的条数
	 * @return
	 */
	public Page<User> getPage(int currentPage,int pageSize){
		return userDao.getPage(currentPage, pageSize);
	}
	
}
