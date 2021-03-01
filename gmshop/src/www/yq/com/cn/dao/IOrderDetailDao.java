package www.yq.com.cn.dao;

import www.yq.com.cn.dao.po.OrderDetail;
import www.yq.com.cn.dto.OrderDetailQueryDTO;
import www.yq.com.cn.utils.Page;

/**
 * 订单明细DAO接口
 * 
 * @author william
 * 
 */
public interface IOrderDetailDao {

	public Page<OrderDetail> getByPagging(
			OrderDetailQueryDTO orderDetailQueryDTO, Integer pageNum,
			Integer pageSize);

	public OrderDetail getById(Long id);
}
