package com.jluzh.Vo;

import java.math.BigDecimal;

public class ProductInfoVo {

	//��ƷId
	private String productId;
	//��Ʒ����
	private String productName;
	//��Ʒ�۸�
	private BigDecimal productPrice;
	//��ƷСͼ
	private String productIcon;
	//��Ʒ����
	private String productDescription;
	
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
	public String getProductIcon() {
		return productIcon;
	}
	public void setProductIcon(String productIcon) {
		this.productIcon = productIcon;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
}
