package com.jluzh.Dao;

import java.math.BigDecimal;

public class ProductInfo {

	//��ƷId
	private String productId;
	//��Ʒ����
	private String productName;
	//��Ʒ���
	private Integer productStock;
	//��Ʒ�۸�
	private BigDecimal productPrice;
	//��ƷСͼ
	private String productIcon;
	//�ϼ�״̬ 0�ϼ� 1�¼�
	private int productStatus;
	//�����
	private int categoryType;
	//��Ʒ����
	private String productDescription;
	
	
	
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
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
	public Integer getProductStock() {
		return productStock;
	}
	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
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
	public int getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}
	public int getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(int categoryType) {
		this.categoryType = categoryType;
	}
	
	
	
}
