package com.jluzh.DaoImpl;

import java.math.BigDecimal;
import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;

import com.jluzh.DBConnectImpl.OrderMasterDBImpl;
import com.jluzh.DBConnnect.OrderMasterDB;
import com.jluzh.Dao.OrderMaster;

public class TestOrderMasterDBImpl {

	private OrderMasterDB orderMasterDaoImpl;
	
	@Test
	public void testOrderMasterList(){
		orderMasterDaoImpl=new OrderMasterDBImpl();
		ArrayList<OrderMaster> rs=orderMasterDaoImpl.OrderMasterList();
		Assert.assertNotNull(rs);
	}
	
	@Test
	public void testFindByUserId(){
		orderMasterDaoImpl=new OrderMasterDBImpl();
		String userId="jjj0755";
		ArrayList<OrderMaster> rs=orderMasterDaoImpl.findByUserId(userId);
		Assert.assertNotNull(rs);
	}
	
	@Test
	public void testSaveOrderMaster(){
		orderMasterDaoImpl=new OrderMasterDBImpl();
		OrderMaster rs=new OrderMaster("123244","jjj","imooc","13631579525","jkljlk",new BigDecimal(54),0,0);
		orderMasterDaoImpl.saveOrderMaster(rs);
	}
}
