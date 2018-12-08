package com.jluzh.DaoImpl;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.jluzh.DBConnectImpl.ProductInfoDBImpl;
import com.jluzh.DBConnnect.ProductInfoDB;
import com.jluzh.DTO.CartDTO;
import com.jluzh.Dao.ProductInfo;

public class TestProductInfoDBImpl {

	private ProductInfoDB productInfoDBImpl;
	
	@Test
	public void testupProductList(){
		productInfoDBImpl=new ProductInfoDBImpl();
		ArrayList<ProductInfo> rs=productInfoDBImpl.upProductList();
		Assert.assertNotNull(rs);
	}
	
	@Test
	public void testFindByProductId(){
		productInfoDBImpl=new ProductInfoDBImpl();
		String id="123465";
		Assert.assertNotNull(productInfoDBImpl.findByProductId(id));
	}
	
	@Test
	public void testDecreaseStock(){
		CartDTO cartDto=new CartDTO("159741",2);
		CartDTO cartDto2=new CartDTO("456798",1);
		ArrayList<CartDTO> list=new ArrayList<CartDTO>();
		list.add(cartDto);
		list.add(cartDto2);
		productInfoDBImpl=new ProductInfoDBImpl();
		productInfoDBImpl.decreaseStock(list);
	}
}
