package www.yq.com.cn.dao;

import www.yq.com.cn.dao.po.Order;
import www.yq.com.cn.dto.OrderQueryDTO;
import www.yq.com.cn.utils.Page;

/**
 * 订单DAO接口
 * 
 * @author william
 * 
 */
public interface IOrderDao {

	/**
	 * 保存
	 */
	public void save(Order order);

	/**
	 * 分页查询
	 */
	public Page<Order> getByPagging(OrderQueryDTO orderQueryDTO,Integer pageNum, Integer pageSize);
}
