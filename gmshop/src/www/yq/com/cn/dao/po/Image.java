package www.yq.com.cn.dao.po;

import java.io.Serializable;

/**
 * ��ƷͼƬ
 * 
 * @author william
 * 
 */
public class Image implements Serializable {

	/**
	 * ͼƬ���
	 */
	private Long id;

	/**
	 * ͼƬ��ַ
	 */
	private String url;

	/**
	 * ������Ʒ
	 */
	private Product product;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Image(Long id, String url, Product product) {
		super();
		this.id = id;
		this.url = url;
		this.product = product;
	}

	public Image() {
		super();
	}

}
