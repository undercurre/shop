package www.yq.com.cn.dao.po;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * ����
 * 
 * @author william
 * 
 */
public class Order implements Serializable {

	/**
	 * �������
	 */
	private Long id;

	/**
	 * �����û�
	 */
	private User user;

	/**
	 * �ռ��˵�ַ
	 */
	private String address;

	/**
	 * �ռ��˵绰
	 */
	private String phone;

	/**
	 * ������ϸ
	 */
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Order(Long id, User user, String address, String phone,
			Set<OrderDetail> orderDetails) {
		super();
		this.id = id;
		this.user = user;
		this.address = address;
		this.phone = phone;
		this.orderDetails = orderDetails;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Order() {
		super();
	}

}
