package www.yq.com.cn.dao;

import www.yq.com.cn.dao.po.Product;
import www.yq.com.cn.dto.ProductQueryDTO;
import www.yq.com.cn.utils.Page;

/**
 * 商品DAO接口
 * 
 * @author william
 * 
 */
public interface IProductDao {

	/**
	 * 保存商品
	 */
	public void save(Product product);

	/**
	 * 根据查询条件查询商品
	 * @param  orderBy 表的字段
	 * @param orderType  asc 升序 或者 desc降序
	 * @return
	 */
	public Page<Product> getByPagging(ProductQueryDTO productQueryDTO,
			String orderBy, String orderType, Integer pageNum, Integer pageSize);

	/**
	 * 根据ID查询
	 */
	public Product getById(Long id);

	/**
	 * 更新产品
	 */
	public void update(Product product);
}
