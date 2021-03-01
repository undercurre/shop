package www.yq.com.cn.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import www.yq.com.cn.dao.IUserDao;
import www.yq.com.cn.dao.po.User;
import www.yq.com.cn.dao.utils.BaseDao;
import www.yq.com.cn.dao.utils.JdbcUtil;
import www.yq.com.cn.utils.Page;

public class UserDaoImpl  implements IUserDao {

	@Override
	public List<User> listAll() {
		List<User> users = new ArrayList<User>();
		Connection conn = null;
		Statement state = null;
		ResultSet rs = null;
		try {
			
			conn = JdbcUtil.getConnection();
			//3.得到StateMent接口指向的对象，并且StateMent接口指向的对象发送SQL到数据库中执行，并返回ResultSet指向的结果集对象
			state = conn.createStatement();
			String allSql="SELECT id,my_name,login_name,pass,email,sex,user_img,born_day FROM tbl_user ";
			//是一张表的所有数据
			rs = state.executeQuery(allSql);
			while (rs.next()) {
				//一个对象映射一条记录
				User  user = new User();
				user.setId(rs.getLong("id"));
				user.setMyName(rs.getString("my_name"));
				user.setLoginName(rs.getString("login_name"));
				user.setPass(rs.getString("pass"));
				user.setEmail(rs.getString("email"));
				user.setSex(rs.getString("sex"));
				user.setUserImg(rs.getString("user_img"));
				user.setBornDay(rs.getDate("born_day"));
				users.add(user);
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//关闭资源
			JdbcUtil.closeAll(rs, state, conn);
		}
		return users;
	}

	@Override
	public int deleteById(long id) {
		
		String deleteSql=" DELETE FROM tbl_user WHERE id= ?";
			
		return JdbcUtil.executeUpdate(deleteSql, id);
	}

	@Override
	public int update(User user) {
		
		String updateSql = "UPDATE tbl_user SET my_name=?,login_name=?,pass=?,email=?,sex=?,user_img=?,born_day=? WHERE id=? ";
		Object[] objects = {user.getMyName(),user.getLoginName(),user.getPass(),user.getEmail(),user.getSex(),user.getUserImg(),user.getBornDay(),user.getId()};	
		return JdbcUtil.executeUpdate(updateSql, objects);
	}

	@Override
	public int save(User user) {
		// INSERT INTO tbl_user VALUES(NULL,'戴浩辉','dhh','111','dhh@qq.com','母','xxdx.jpg','1990-09-08')
		String sql = "INSERT INTO tbl_user VALUES(NULL,?,?,?,?,?,?,?)";
		Object[] objects = {user.getMyName(),user.getLoginName(),user.getPass(),user.getEmail(),user.getSex(),user.getUserImg(),user.getBornDay()};
		return JdbcUtil.executeUpdate(sql, objects);
	}

	@Override
	public User getById(long id) {
		User user = null;
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			conn = JdbcUtil.getConnection();
			//3.得到StateMent接口指向的对象，并且StateMent接口指向的对象发送SQL到数据库中执行，并返回ResultSet指向的结果集对象
			String getByIdSql="SELECT id,my_name,login_name,pass,email,sex,user_img,born_day FROM tbl_user where id = ? ";
			ps = conn.prepareStatement(getByIdSql);
			ps.setObject(1, id);;
			//是一张表的所有数据
			rs = ps.executeQuery();
			if (rs.next()) {
				//一个对象映射一条记录
				user = new User();
				user.setId(rs.getLong("id"));
				user.setMyName(rs.getString("my_name"));
				user.setLoginName(rs.getString("login_name"));
				user.setPass(rs.getString("pass"));
				user.setEmail(rs.getString("email"));
				user.setSex(rs.getString("sex"));
				user.setUserImg(rs.getString("user_img"));
				user.setBornDay(rs.getDate("born_day"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//关闭资源
			JdbcUtil.closeAll(rs, ps, conn);
		}
		
		return user;
	}

	@Override
	public User loing(String loginName, String pass) {
		User user = null;
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			conn = JdbcUtil.getConnection();
			//3.得到StateMent接口指向的对象，并且StateMent接口指向的对象发送SQL到数据库中执行，并返回ResultSet指向的结果集对象
			//SELECT id,my_name,login_name,pass,email,sex,user_img,born_day FROM tbl_user WHERE login_name ='tom' AND pass='123'
			//String loginSql="SELECT id,my_name,login_name,pass,email,sex,user_img,born_day FROM tbl_user WHERE login_name ='"+loginName+"' AND pass='"+pass+"'";
			String loginSql= "SELECT id,my_name,login_name,pass,email,sex,user_img,born_day FROM tbl_user WHERE login_name =? AND pass=?";
			ps = conn.prepareStatement(loginSql);
			ps.setObject(1, loginName);
			ps.setObject(2, pass);
			//是一张表的所有数据
			rs = ps.executeQuery();
			if (rs.next()) {
				//一个对象映射一条记录
				user = new User();
				user.setId(rs.getLong("id"));
				user.setMyName(rs.getString("my_name"));
				user.setLoginName(rs.getString("login_name"));
				user.setPass(rs.getString("pass"));
				user.setEmail(rs.getString("email"));
				user.setSex(rs.getString("sex"));
				user.setUserImg(rs.getString("user_img"));
				user.setBornDay(rs.getDate("born_day"));
				
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//关闭资源
			JdbcUtil.closeAll(rs, ps, conn);
		}
		
		return user;
	}

	@Override
	public int getTotalCount() {
		int count = -1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			//SELECT COUNT(1)  AS totalCount FROM  tbl_user
			String countSql= "SELECT COUNT(1)  AS totalCount FROM  tbl_user ";
			ps = conn.prepareStatement(countSql);
			rs = ps.executeQuery();
			if (rs.next()) {
				count = rs.getInt("totalCount");
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//关闭资源
			JdbcUtil.closeAll(rs, ps, conn);
		}
		return count;
	}
	
	/**
	 * 得到一页中的详细信息
	 * @param currentPage 当前页码
	 * @param pageSize 每页显示的条数
	 * @return
	 */
	public List<User> getOnePageInfo(int currentPage,int pageSize){
		List<User> onePageUsers = new ArrayList<User>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			//3.得到StateMent接口指向的对象，并且StateMent接口指向的对象发送SQL到数据库中执行，并返回ResultSet指向的结果集对象
			//SELECT * FROM   tbl_user LIMIT 8,4
			//SELECT * FROM   tbl_user LIMIT (currentPage-1)*pageSize,pageSize
			String pageSql="SELECT * FROM   tbl_user LIMIT ?,? ";
			ps = conn.prepareStatement(pageSql);
			ps.setObject(1, (currentPage-1)*pageSize);
			ps.setObject(2, pageSize);
			//是一张表的所有数据
			rs = ps.executeQuery();
			while (rs.next()) {
				//一个对象映射一条记录
				User  user = new User();
				user.setId(rs.getLong("id"));
				user.setMyName(rs.getString("my_name"));
				user.setLoginName(rs.getString("login_name"));
				user.setPass(rs.getString("pass"));
				user.setEmail(rs.getString("email"));
				user.setSex(rs.getString("sex"));
				user.setUserImg(rs.getString("user_img"));
				user.setBornDay(rs.getDate("born_day"));
				onePageUsers.add(user);
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//关闭资源
			JdbcUtil.closeAll(rs, ps, conn);
		}
		return onePageUsers;
	}
	
	/**
	 * 封装一页中的全部信息
	 * @param currentPage  当前页码
	 * @param pageSize 每页显示的条数
	 * @return
	 */
	public Page<User> getPage(int currentPage,int pageSize) {
		int totalCount = this.getTotalCount();
		List<User> lists  = this.getOnePageInfo(currentPage, pageSize);
		return new Page<User>(currentPage, totalCount, pageSize, lists);
	}

}
