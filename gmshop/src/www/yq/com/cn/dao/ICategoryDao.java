package www.yq.com.cn.dao;

import java.util.List;

import www.yq.com.cn.dao.po.Category;
import www.yq.com.cn.utils.Page;



/**
 * ��Ʒ����Dao
 * 
 * @author william
 * 
 */
public interface ICategoryDao {

	/**
	 * ��ҳ��ѯ���е���Ʒ����
	 * 
	 * @return
	 */
	public Page<Category> getByPagging(Integer page, Integer pageSize);

	/**
	 * �����Ʒ����
	 */
	public void save(Category category);

	/**
	 * ��ѯ������Ʒ����
	 */
	public List<Category> getAll();
}
