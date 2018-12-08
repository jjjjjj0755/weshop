package com.jluzh.DBConnnect;

import java.util.ArrayList;

import com.jluzh.Dao.OrderMaster;

public interface OrderMasterDB {

	//获取订单列表
	public ArrayList<OrderMaster> OrderMasterList();
	
	//查找买家订单
	public ArrayList<OrderMaster> findByUserId(String userId);
	
	//保存买家订单
	public void saveOrderMaster(OrderMaster orderMaster);
	
}
