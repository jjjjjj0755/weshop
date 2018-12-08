package com.jluzh.DBConnnect;


import java.util.ArrayList;

import com.jluzh.DTO.CartDTO;
import com.jluzh.Dao.ProductInfo;

public interface ProductInfoDB {
	
	//根据db找出productInfo
	public ProductInfo findByProductId(String productId);
	
	//获取上架商品列表
	public ArrayList<ProductInfo> upProductList();
	
	//减少库存
	public void decreaseStock(ArrayList<CartDTO> cartDtoList);
}
