package www.yq.com.cn.dao.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDao {
	//得到数据库连接
		public Connection getConnection() {
			return null;
		}
		//关闭资源
		public void closeAll(ResultSet rs,Statement state,Connection conn) {
			
		}
}
