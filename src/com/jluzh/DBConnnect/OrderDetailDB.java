package com.jluzh.DBConnnect;

import java.util.ArrayList;

import com.jluzh.Dao.OrderDetail;

public interface OrderDetailDB {
     
	
	//���ݶ����Ų��Ҷ�������
	public ArrayList<OrderDetail> findByOrderId(String orderId);
	
	//��ȡ���������б�
	public ArrayList<OrderDetail> orderDetailList();
	
	//�洢��������
	public void saveOrderDetail(OrderDetail orderDetail);
}
