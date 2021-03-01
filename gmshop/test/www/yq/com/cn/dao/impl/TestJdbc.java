package www.yq.com.cn.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.org.apache.regexp.internal.recompile;

public class TestJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * * 1.加载驱动
			* 2得到Connection接口指向的对象
			* 3.得到StateMent接口指向的对象，并且StateMent接口指向的对象发送SQL到数据库中执行，并返回ResultSet指向的结果集对象
			* 4.处理结果集对象
			* 5.关闭资源
		 */
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gmshop", "root", "123456");
		Statement state = conn.createStatement();
		String allSql="SELECT id,my_name,login_name,pass,email,sex,user_img,born_day FROM tbl_user ";
		ResultSet rs = state.executeQuery(allSql);
		while (rs.next()) {
			int id = rs.getInt("id");
			String myName = rs.getString("my_name");
			System.out.println(id+"\t"+myName);
		}
		rs.close();
		state.close();
		conn.close();
	}
	
}
