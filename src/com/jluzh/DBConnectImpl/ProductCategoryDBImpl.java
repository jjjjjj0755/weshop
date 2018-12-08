package com.jluzh.DBConnectImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.jluzh.DBConnnect.DBHelper;
import com.jluzh.DBConnnect.ProductCategoryDB;
import com.jluzh.Dao.ProductCategory;
import com.jluzh.Dao.ProductInfo;

public class ProductCategoryDBImpl implements ProductCategoryDB {

	public ArrayList<ProductCategory> categoryQuery(String sql){
		ArrayList<ProductCategory> productCategoryList=new ArrayList<ProductCategory>();
		DBHelper db=new DBHelper();
		db.start();
		ResultSet rs=db.query(sql);
		try {
			while(rs.next()){
				ProductCategory productCategory=new ProductCategory();
				productCategory.setCategoryId(rs.getString("category_id"));
				productCategory.setCategoryName(rs.getString("category_Name"));
				productCategory.setCategoryType(rs.getInt("category_type"));
				productCategory.setCategoryUrl(rs.getString("category_url"));
				productCategoryList.add(productCategory);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productCategoryList;
	}

	@Override
	public ArrayList<ProductCategory> productCategoryList(ArrayList<ProductInfo> productInfoList) {
		//查找上架的商品的类目列表
		int i=0;
		HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
		ArrayList<ProductCategory> productCategoryList=new ArrayList<ProductCategory>();
		for(ProductInfo productInfo:productInfoList){
			if(!hashmap.containsValue(productInfo.getCategoryType()))
			{
				hashmap.put(i++, productInfo.getCategoryType());
				//如果productInfo type已经添加  就不再添加了
				String sql=String.format("select* from product_category where category_type='%s';",productInfo.getCategoryType());
				productCategoryList.addAll(categoryQuery(sql));
			}
		}
		return productCategoryList;
	}

}
