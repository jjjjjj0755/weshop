package com.jluzh.DBConnnect;

import java.util.ArrayList;

import com.jluzh.Dao.OrderMaster;

public interface OrderMasterDB {

	//��ȡ�����б�
	public ArrayList<OrderMaster> OrderMasterList();
	
	//������Ҷ���
	public ArrayList<OrderMaster> findByUserId(String userId);
	
	//������Ҷ���
	public void saveOrderMaster(OrderMaster orderMaster);
	
}
