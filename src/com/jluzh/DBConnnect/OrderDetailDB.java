package com.jluzh.DBConnnect;

import java.util.ArrayList;

import com.jluzh.Dao.OrderDetail;

public interface OrderDetailDB {
     
	
	//根据订单号查找订单详情
	public ArrayList<OrderDetail> findByOrderId(String orderId);
	
	//获取订单详情列表
	public ArrayList<OrderDetail> orderDetailList();
	
	//存储订单详情
	public void saveOrderDetail(OrderDetail orderDetail);
}
