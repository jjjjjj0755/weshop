package com.jluzh.DaoImpl;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.jluzh.DBConnectImpl.OrderDetailDBImpl;
import com.jluzh.DBConnnect.OrderDetailDB;
import com.jluzh.Dao.OrderDetail;

public class TestOrderDetailDBImpl {

	private OrderDetailDB orderDetailDBImpl;
	
	@Test
	public void testFindByOrderId(){
		orderDetailDBImpl=new OrderDetailDBImpl();
		String orderId="123456";
		ArrayList<OrderDetail> rs=orderDetailDBImpl.findByOrderId(orderId);
		Assert.assertNotNull(rs);
	}
	
	@Test
	public void testOrderDetailList()
	{
		orderDetailDBImpl=new OrderDetailDBImpl();
		ArrayList<OrderDetail> rs=orderDetailDBImpl.orderDetailList();
		System.out.println(rs.get(0).getPrductQuantity());
		Assert.assertNotNull(rs);
	}
	
	@Test
	public void testSaveOrderDetail(){
		OrderDetail orderDetail=new OrderDetail("78541664","1154544",
				"159741","±ãÀûÌù",new BigDecimal(6.5),new BigDecimal(1),"http://xxx.jpg");
		orderDetailDBImpl=new OrderDetailDBImpl();
		orderDetailDBImpl.saveOrderDetail(orderDetail);
	}
}
