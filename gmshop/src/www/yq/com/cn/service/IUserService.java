package www.yq.com.cn.service;

import java.util.List;

import www.yq.com.cn.dao.po.User;
import www.yq.com.cn.utils.Page;

public interface IUserService {
	/**
	 * 查询全部用户信息
	 * @return 返回全部用户信息
	 */
	public List<User> listAll() ;
	/**
	 * 根据id删除一个用户信息
	 * @param id  主键
	 * @return 删除成功返回受影响的行数，失败返回-1
	 */
	public int deleteById(long id);
	/**
	 * 修改一个用户信息
	 * @param user
	 * @return 修改成功返回受影响的行数，失败返回-1
	 */
	public int update(User user);
	/**
	 * 添加一个用户信息
	 * @param user
	 * @return 添加成功返回受影响的行数，失败返回-1
	 */
	public int save(User user);
	/**
	 * 根据id查询一个用户信息
	 * @param id 主键
	 * @return 查询成功返回一个用户信息，失败返回null
	 */
	public User getById(long id);
	/**
	 * 登录功能
	 * @param loginName 用户名
	 * @param pass 密码
	 * @return 登录成功返回一个用户信息，失败返回null
	 */
	public User loing(String loginName,String pass);
	/**
	 * 封装一页中的全部信息
	 * @param currentPage  当前页码
	 * @param pageSize 每页显示的条数
	 * @return
	 */
	public Page<User> getPage(int currentPage,int pageSize);
}
