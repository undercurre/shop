package www.yq.com.cn.dao.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDao {
	//�õ����ݿ�����
		public Connection getConnection() {
			return null;
		}
		//�ر���Դ
		public void closeAll(ResultSet rs,Statement state,Connection conn) {
			
		}
}
