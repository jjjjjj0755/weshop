package com.jluzh.DBConnectImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jluzh.DBConnnect.DBHelper;
import com.jluzh.DBConnnect.OrderMasterDB;
import com.jluzh.Dao.OrderMaster;

public class OrderMasterDBImpl implements OrderMasterDB {

	private DBHelper db;
	
	@Override
	public ArrayList<OrderMaster> OrderMasterList() {
		String sql="select * from order_master";
		return orderDetailQuery(sql);
	}

	@Override
	public ArrayList<OrderMaster> findByUserId(String userId) {
		String sql=String.format("select * from order_master where user_name='%s'",userId);
		return orderDetailQuery(sql);
	}
	
	public void saveOrderMaster(OrderMaster orderMaster){
		String sql=String.format("insert into Order_master(order_id,buyer_name,buyer_phone," +
				"buyer_address,user_name,order_amount,order_status,pay_status) values("+
				"'%s','%s','%s','%s','%s','%s','%s','%s');", orderMaster.getOrderId(),
				orderMaster.getBuyerName(),orderMaster.getBuyerPhone(),
				orderMaster.getBuyerAddress(),orderMaster.getUserName(),
				orderMaster.getOrderAmount(),orderMaster.getOrderStatus(),
				orderMaster.getPayStatus());
				save(sql);
	}

	public void save(String sql){
		db=new DBHelper();
		db.start();
		db.update(sql);
		 if(db!=null){
	        	db.close();
	        }
	}
	
	public ArrayList<OrderMaster>  orderDetailQuery(String sql){
		ArrayList<OrderMaster> orderMasterList=new ArrayList<OrderMaster>();
		db=new DBHelper();
		db.start();
        ResultSet rs=db.query(sql);
        try {
			while(rs.next()){
				//System.out.println(rs.getString("order_id"));
				   OrderMaster orderMaster=new OrderMaster();
				   orderMaster.setOrderId(rs.getString("Order_id"));
				   orderMaster.setOrderAmount(rs.getBigDecimal("order_amount"));
				   orderMaster.setBuyerName(rs.getString("buyer_name"));
				   orderMaster.setBuyerAddress(rs.getString("buyer_address"));
				   orderMaster.setOrderStatus(rs.getInt("order_status"));
				   orderMaster.setPayStatus(rs.getInt("pay_status"));
				   orderMaster.setUserName(rs.getString("user_name"));
				   orderMasterList.add(orderMaster);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if(db!=null){
        	db.close();
        }
		return orderMasterList;
	}
}
