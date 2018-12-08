package com.jluzh.Dao;

import java.math.BigDecimal;
import java.sql.Date;

public class OrderMaster {
	
	private String orderId;
	//�������
	private String buyerName;
	//��ҵ�ַ
	private String buyerAddress;
	//��ҵ绰
	private String buyerPhone;
	//�û���
	private String userName;
	//�����ܽ��
	private BigDecimal orderAmount;
	//����״̬ Ĭ��0��δ���
	private Integer orderStatus;
	//֧��״̬ Ĭ��0��δ֧��
	private Integer payStatus;
	//����ʱ��
	private Date createTime;
	//����ʱ��
	private Date updateTime;
	
	public OrderMaster(){
		
	}
	
	public OrderMaster(String orderId,String buyerName,String buyerAddress,String buyerPhone,String userName, BigDecimal orderAmount,
			Integer orderStatus,Integer payStatus){
		this.orderId=orderId;
		this.buyerName=buyerName;
		this.buyerAddress=buyerAddress;
		this.buyerPhone=buyerPhone;
		this.userName=userName;
		this.orderAmount=orderAmount;
		this.orderStatus=orderStatus;
		this.payStatus=payStatus;
	}
	
	public String getBuyerPhone() {
		return buyerPhone;
	}
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer i) {
		this.orderStatus = i;
	}
	public Integer getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	

}
