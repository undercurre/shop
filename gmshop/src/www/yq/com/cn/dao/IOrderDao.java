package www.yq.com.cn.dao;

import www.yq.com.cn.dao.po.Order;
import www.yq.com.cn.dto.OrderQueryDTO;
import www.yq.com.cn.utils.Page;

/**
 * ����DAO�ӿ�
 * 
 * @author william
 * 
 */
public interface IOrderDao {

	/**
	 * ����
	 */
	public void save(Order order);

	/**
	 * ��ҳ��ѯ
	 */
	public Page<Order> getByPagging(OrderQueryDTO orderQueryDTO,Integer pageNum, Integer pageSize);
}
