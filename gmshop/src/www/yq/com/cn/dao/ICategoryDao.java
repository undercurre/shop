package www.yq.com.cn.dao;

import java.util.List;

import www.yq.com.cn.dao.po.Category;
import www.yq.com.cn.utils.Page;



/**
 * 商品分类Dao
 * 
 * @author william
 * 
 */
public interface ICategoryDao {

	/**
	 * 分页查询所有的商品分类
	 * 
	 * @return
	 */
	public Page<Category> getByPagging(Integer page, Integer pageSize);

	/**
	 * 添加商品分类
	 */
	public void save(Category category);

	/**
	 * 查询所有商品分类
	 */
	public List<Category> getAll();
}
