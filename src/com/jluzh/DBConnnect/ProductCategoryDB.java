package com.jluzh.DBConnnect;


import java.util.ArrayList;

import com.jluzh.Dao.ProductCategory;
import com.jluzh.Dao.ProductInfo;

public interface ProductCategoryDB {

	//�����Ʒ�б�
	public ArrayList<ProductCategory> productCategoryList(ArrayList<ProductInfo> productInfoList);
}
