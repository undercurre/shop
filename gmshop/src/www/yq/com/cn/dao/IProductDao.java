package www.yq.com.cn.dao;

import www.yq.com.cn.dao.po.Product;
import www.yq.com.cn.dto.ProductQueryDTO;
import www.yq.com.cn.utils.Page;

/**
 * ��ƷDAO�ӿ�
 * 
 * @author william
 * 
 */
public interface IProductDao {

	/**
	 * ������Ʒ
	 */
	public void save(Product product);

	/**
	 * ���ݲ�ѯ������ѯ��Ʒ
	 * @param  orderBy ����ֶ�
	 * @param orderType  asc ���� ���� desc����
	 * @return
	 */
	public Page<Product> getByPagging(ProductQueryDTO productQueryDTO,
			String orderBy, String orderType, Integer pageNum, Integer pageSize);

	/**
	 * ����ID��ѯ
	 */
	public Product getById(Long id);

	/**
	 * ���²�Ʒ
	 */
	public void update(Product product);
}
