package com.jluzh.DBConnectImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jluzh.DBConnnect.DBHelper;
import com.jluzh.DBConnnect.OrderDetailDB;
import com.jluzh.Dao.OrderDetail;


public class OrderDetailDBImpl implements OrderDetailDB {

	private DBHelper db;
	//这里不用preparedStatement() 可能会因为用户输入导致错误
	//根据订单号查找订单详情
	@Override
	public ArrayList<OrderDetail> findByOrderId(String orderId) {
		String sql=String.format("select* from order_detail where order_id='%s';",orderId);
		return orderDetailQuery(sql);
	}

	@Override
	public ArrayList<OrderDetail> orderDetailList() {
		String sql="select* from order_detail";
		return orderDetailQuery(sql);
	}
	
	public void saveOrderDetail(OrderDetail orderDetail){
		String sql=String.format("insert into order_detail(order_id,detail_id,product_id," +
				"product_name,product_price,product_quantity,product_icon) " +
				"values('%s','%s','%s','%s','%s','%s','%s')",
				orderDetail.getOrderId(),orderDetail.getDetailId(),
				orderDetail.getProductId(),
				orderDetail.getProductName(),orderDetail.getProductPrice(),
				orderDetail.getPrductQuantity(),orderDetail.getProductIcon());
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
	
	public ArrayList<OrderDetail>  orderDetailQuery(String sql){
		ArrayList<OrderDetail> orderDetailList=new ArrayList<OrderDetail>();
		db=new DBHelper();
		db.start();
        ResultSet rs=db.query(sql);
        try {
			while(rs.next()){
				//System.out.println(rs.getString("order_id"));
				    OrderDetail orderDetail=new OrderDetail();
					orderDetail.setOrderId(rs.getString("order_Id"));
					orderDetail.setDetailId(rs.getString("detail_Id"));
					orderDetail.setProductId(rs.getString("product_Id"));
					orderDetail.setProductName(rs.getString("product_Name"));
					orderDetail.setProductPrice(rs.getBigDecimal("product_Price"));
					orderDetail.setPrductQuantity(rs.getBigDecimal("product_Quantity"));
					orderDetail.setProductIcon(rs.getString("product_Icon"));
					orderDetailList.add(orderDetail);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if(db!=null){
        	db.close();
        }
		return orderDetailList;
	}

}
