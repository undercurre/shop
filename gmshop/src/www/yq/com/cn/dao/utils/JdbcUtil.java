package www.yq.com.cn.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	static {
		//1.��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//ͨ�õ���ɾ�Ĳ���
	public static int executeUpdate(String sql,Object... objects) {
		int rows = -1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//2�õ�Connection�ӿ�ָ��Ķ���
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
	//�õ����ݿ�����
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//2�õ�Connection�ӿ�ָ��Ķ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gmshop", "root", "123456");
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//�ر���Դ  Statement ����  PreparedStatement ����
	public static void closeAll(ResultSet rs,Statement state,Connection conn) {
		//�ر���Դ
		// ���㣺�����������ж��Ƿ�����
		// ���ж����㣬����ͼ��������
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
