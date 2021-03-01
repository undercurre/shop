package www.yq.com.cn.dao.po;

import java.util.Date;

/*

 * 
 * 1.类名映射表名
 * 2.属性映射字段
 * 3.属性类型映射字段类型
 * 4.一个对象映射一条记录
 * 
 */
public class User {
	private long id;
	private String myName; 
	private String loginName;
	private String pass;
	private String email;
	private String sex;
	private String userImg;
	private Date bornDay;
	
	public User() {
		super();
	}
	public User(long id, String myName, String loginName, String pass, String email, String sex, String userImg,
			Date bornDay) {
		super();
		this.id = id;
		this.myName = myName;
		this.loginName = loginName;
		this.pass = pass;
		this.email = email;
		this.sex = sex;
		this.userImg = userImg;
		this.bornDay = bornDay;
	}
	public User( String myName, String loginName, String pass, String email, String sex, String userImg,
			Date bornDay) {
		super();
		this.myName = myName;
		this.loginName = loginName;
		this.pass = pass;
		this.email = email;
		this.sex = sex;
		this.userImg = userImg;
		this.bornDay = bornDay;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public Date getBornDay() {
		return bornDay;
	}
	public void setBornDay(Date bornDay) {
		this.bornDay = bornDay;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", myName=" + myName + ", loginName=" + loginName + ", pass=" + pass + ", email="
				+ email + ", sex=" + sex + ", userImg=" + userImg + ", bornDay=" + bornDay + "]";
	}
	
	
}
