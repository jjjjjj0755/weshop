package com.jluzh.Dao;


import java.math.BigDecimal;
import java.sql.Date;

public class OrderDetail {

	private String detailId;
	private String orderId;
	private String productId;
	private String productName;
	private BigDecimal productPrice;
	//商品数量
	private BigDecimal prductQuantity;
	private String productIcon;
	private Date createTime;
	private Date updateTime;
	public OrderDetail(){
		
	}
	
	public OrderDetail(String detailId,String orderId,String productId,
			String productName,BigDecimal productPrice,BigDecimal prductQuantity,
			String productIcon){
		this.detailId=detailId;
		this.orderId=orderId;
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
		this.prductQuantity=prductQuantity;
		this.productIcon=productIcon;
	}
	
	public String getDetailId() {
		return detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public BigDecimal getPrductQuantity() {
		return prductQuantity;
	}
	public void setPrductQuantity(BigDecimal prductQuantity) {
		this.prductQuantity = prductQuantity;
	}
	public String getProductIcon() {
		return productIcon;
	}
	public void setProductIcon(String productIcon) {
		this.productIcon = productIcon;
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
