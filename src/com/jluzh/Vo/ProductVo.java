package com.jluzh.Vo;

import java.util.ArrayList;

public class ProductVo {

	private String categoryName;
	
	private int categoryType;
	
	private String categoryUrl;
	
	private ArrayList<ProductInfoVo> productInfoVoList;
	
	public String getCategoryUrl() {
		return categoryUrl;
	}

	public void setCategoryUrl(String categoryUrl) {
		this.categoryUrl = categoryUrl;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(int categoryType) {
		this.categoryType = categoryType;
	}

	public ArrayList<ProductInfoVo> getProductInfoVoList() {
		return productInfoVoList;
	}

	public void setProductInfoVoList(ArrayList<ProductInfoVo> productInfoVoList) {
		this.productInfoVoList = productInfoVoList;
	}
	
	
}
