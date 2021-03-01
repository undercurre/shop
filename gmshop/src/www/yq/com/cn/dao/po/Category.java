package www.yq.com.cn.dao.po;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * ��Ʒ���
 * 
 * @author william
 * 
 */
public class Category implements Serializable {

	/**
	 * �����
	 */
	private Long id;

	/**
	 * �������
	 */
	private String name;

	/**
	 * ��Ʒ����
	 */
	private Set<Product> products = new HashSet<Product>();

	/**
	 * �����
	 */
	private Set<Category> categories = new HashSet<Category>();

	/**
	 * ����
	 * 
	 * @return
	 */
	private Category parent = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Category(Long id, String name, Set<Product> products,
			Set<Category> categories) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
		this.categories = categories;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Category() {
		super();
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

}
