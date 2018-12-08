package com.jluzh.DaoImpl;


import junit.framework.Assert;

import org.junit.Test;

import com.jluzh.DBConnectImpl.ProductCategoryDBImpl;
import com.jluzh.DBConnectImpl.ProductInfoDBImpl;
import com.jluzh.DBConnnect.ProductCategoryDB;
import com.jluzh.DBConnnect.ProductInfoDB;

public class TestProductCategoryDBImpl {

	private ProductCategoryDB productCategory;
	@Test
	public void testProductCategoryList(){
		productCategory=new ProductCategoryDBImpl();
		ProductInfoDB productInfoDao=new ProductInfoDBImpl();
		Assert.assertNotNull(productCategory.productCategoryList(productInfoDao.upProductList()));
	} 
}
