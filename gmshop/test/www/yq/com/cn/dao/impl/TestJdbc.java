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
		 * * 1.��������
			* 2�õ�Connection�ӿ�ָ��Ķ���
			* 3.�õ�StateMent�ӿ�ָ��Ķ��󣬲���StateMent�ӿ�ָ��Ķ�����SQL�����ݿ���ִ�У�������ResultSetָ��Ľ��������
			* 4.������������
			* 5.�ر���Դ
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
