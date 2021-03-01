package www.yq.com.cn.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	static {
		//1.加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//通用的增删改操作
	public static int executeUpdate(String sql,Object... objects) {
		int rows = -1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//2得到Connection接口指向的对象
			conn = JdbcUtil.getConnection();
			
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < objects.length; i++) {
				ps.setObject((i+1), objects[i]);
			}
			rows = ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.closeAll(rs, ps, conn);
		}
		return rows;
	}
	//得到数据库连接
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//2得到Connection接口指向的对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gmshop", "root", "123456");
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//关闭资源  Statement 父类  PreparedStatement 子类
	public static void closeAll(ResultSet rs,Statement state,Connection conn) {
		//关闭资源
		// 扑鱼：先撒网，再判断是否有鱼
		// 先判断有鱼，再试图撒网扑鱼
		if (rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (state!=null) {
			try {
				state.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
