package com.jluzh.DBConnnect;


import java.util.ArrayList;

import com.jluzh.Dao.ProductCategory;
import com.jluzh.Dao.ProductInfo;

public interface ProductCategoryDB {

	//获得商品列表
	public ArrayList<ProductCategory> productCategoryList(ArrayList<ProductInfo> productInfoList);
}
