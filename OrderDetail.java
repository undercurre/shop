package www.yq.com.cn.dao.po;

import java.io.Serializable;

/**
 * ������ϸ
 * 
 * @author william
 * 
 */
public class OrderDetail implements Serializable {

	/**
	 * ������ϸ���
	 */
	private Long id;

	/**
	 * ������Ʒ
	 */
	private Product product;

	/**
	 * ��������
	 */
	private Integer buyNum;

	/**
	 * ��Ʒ����
	 */
	private Float price;

	/**
	 * ��������
	 */
	private Order order;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderDetail(Long id, Product product, Integer buyNum, Float price,
			Order order) {
		super();
		this.id = id;
		this.product = product;
		this.buyNum = buyNum;
		this.price = price;
		this.order = order;
	}

	public OrderDetail() {
		super();
	}

}
