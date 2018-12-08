package com.jluzh.DTO;

import java.math.BigDecimal;

public class CartDTO {

	private String productId;
	
	private int productQuantity;
	
	public CartDTO(String productId,int bigDecimal){
		this.productId=productId;
		this.productQuantity=bigDecimal;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
}
