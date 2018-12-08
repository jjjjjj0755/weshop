package com.jluzh.Dao;

public class ProductCategory {

	
	private String categoryId;
	//类目名字
	private String categoryName;
	//类目编号
	private int categoryType;
	//类目url
	private String categoryUrl;
	public String getCategoryUrl() {
		return categoryUrl;
	}
	public void setCategoryUrl(String categoryUrl) {
		this.categoryUrl = categoryUrl;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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
	public void setCategoryType(int i) {
		this.categoryType = i;
	}
	
	
	
}
