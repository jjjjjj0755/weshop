package com.jluzh.DBConnectImpl;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.jluzh.DBConnnect.DBHelper;
import com.jluzh.DBConnnect.ProductInfoDB;
import com.jluzh.DTO.CartDTO;
import com.jluzh.Dao.ProductInfo;
import com.jluzh.Enum.ProductStatusEnum;

public class ProductInfoDBImpl implements ProductInfoDB {

	private Logger log=Logger.getLogger(Test.class.getName());
	
	//获取上架商品列表
	public ArrayList<ProductInfo> upProductList() {
		String sql=String.format("select* from product_Info where product_status='%d';",ProductStatusEnum.UP.getCode());
		return productInfoQuery(sql);
	}
	
	public ProductInfo findByProductId(String productId){
		String sql=String.format("select* from product_Info where product_id='%s'", productId);
		ArrayList<ProductInfo> list=productInfoQuery(sql);
		ProductInfo productInfo=list.get(0);
		return productInfo;
	}
	
	//减库存
	public void decreaseStock(ArrayList<CartDTO> cartDtoList){
		for(CartDTO cartDTO:cartDtoList){
	           ProductInfo productInfo= findByProductId(cartDTO.getProductId());
	           if(productInfo==null){
	        	   log.error("仓库中不存在该商品");
	           }
	         int result=  productInfo.getProductStock()- cartDTO.getProductQuantity();

	           if(result<0){
	        	   log.error("库存不足");
	           }else{
	        	    productInfo.setProductStock( result );
	        	    String sql=String.format("update product_info set product_stock='%s' where product_id='%s';",result,productInfo.getProductId());
	        	    save(sql);
	           }
		}
	}
	
	public void save(String sql){
		DBHelper db=new DBHelper();
		db.start();
		db.update(sql);
		 if(db!=null){
	        	db.close();
	        }
	}
	
	public ArrayList<ProductInfo> productInfoQuery(String sql){
		ArrayList<ProductInfo> productInfoList=new ArrayList<ProductInfo>();
		DBHelper db=new DBHelper();
		db.start();
		ResultSet rs=db.query(sql);
		try {
			while(rs.next()){
				ProductInfo productInfo=new ProductInfo();
				productInfo.setProductId(rs.getString("product_id"));
				productInfo.setProductName(rs.getString("product_Name"));
				productInfo.setProductStock(rs.getInt("product_stock"));
				productInfo.setProductPrice(rs.getBigDecimal("product_price"));
				productInfo.setProductIcon(rs.getString("product_Icon"));
				productInfo.setProductStatus(rs.getInt("product_status"));
				productInfo.setProductDescription(rs.getString("product_description"));
				productInfo.setCategoryType(rs.getInt("category_type"));
				productInfoList.add(productInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 if(db!=null){
	        	db.close();
	        }
		return productInfoList;
	}

}
