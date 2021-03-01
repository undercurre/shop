package www.yq.com.cn.dao.impl;

import www.yq.com.cn.dao.IOrderDao;
import www.yq.com.cn.dao.po.Order;
import www.yq.com.cn.dto.OrderQueryDTO;
import www.yq.com.cn.utils.Page;

public class OrderDaoImpl implements IOrderDao {

	@Override
	public void save(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Order> getByPagging(OrderQueryDTO orderQueryDTO, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
