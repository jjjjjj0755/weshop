package com.jluzh.DTO;

import java.util.ArrayList;

import com.jluzh.Dao.OrderDetail;

public class OrderDTO {

	private String orderId;
	
	private String buyerName;
	
	private String buyerAddress;
	
	private String buyerPhone;
	
	private String userName;
	
	private String orderAmount;
	
	private Integer orderStatus;
	
	private Integer payStatus;
	
	private ArrayList<OrderDetail> orderDetailList;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerAddress() {
		return buyerAddress;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	public String getBuyerPhone() {
		return buyerPhone;
	}

	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public ArrayList<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(ArrayList<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	
	
}
