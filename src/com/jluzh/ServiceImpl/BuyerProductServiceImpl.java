package com.jluzh.ServiceImpl;

import java.util.ArrayList;

import com.jluzh.DBConnectImpl.ProductCategoryDBImpl;
import com.jluzh.DBConnectImpl.ProductInfoDBImpl;
import com.jluzh.DBConnnect.ProductCategoryDB;
import com.jluzh.DBConnnect.ProductInfoDB;
import com.jluzh.Dao.ProductCategory;
import com.jluzh.Dao.ProductInfo;
import com.jluzh.Service.BuyerProductService;
import com.jluzh.Vo.ProductInfoVo;
import com.jluzh.Vo.ProductVo;
import com.jluzh.Vo.ResultVo;
import com.jluzh.utils.ResultVoUtil;

public class BuyerProductServiceImpl implements BuyerProductService {
	
	private ProductInfoDB productInfoDBImpl;
	private ArrayList<ProductInfo> productInfoList;
	private ProductCategoryDB productCategoryDBImpl;
	private ArrayList<ProductVo> productVoList;
	
	public ResultVo<ArrayList<ProductVo>>  findUpProduct(){
	
	productInfoDBImpl=new ProductInfoDBImpl();
	productInfoList=productInfoDBImpl.upProductList();
	productCategoryDBImpl=new ProductCategoryDBImpl();
	productVoList=new ArrayList<ProductVo>();
	//1.查询所有上架商品
	//2.查询类目
	ArrayList<ProductCategory> productCategoryList=productCategoryDBImpl.productCategoryList(productInfoList);
	//3.数据拼装
	//   ResultVo  ProductInfoVo  ProductVo
	for(ProductCategory productCategory:productCategoryList){
		ProductVo productVo=new ProductVo();
		productVo.setCategoryName(productCategory.getCategoryName());
		productVo.setCategoryType(productCategory.getCategoryType());
		productVo.setCategoryUrl(productCategory.getCategoryUrl());
		ArrayList<ProductInfoVo> prductInfoVoList=new ArrayList<ProductInfoVo>();
		for(ProductInfo productInfo:productInfoList){
			if(productCategory.getCategoryType()==productInfo.getCategoryType())
			{
				ProductInfoVo productInfoVo=new ProductInfoVo();
				productInfoVo.setProductId(productInfo.getProductId());
				productInfoVo.setProductDescription(productInfo.getProductDescription());
				productInfoVo.setProductIcon(productInfo.getProductIcon());
				productInfoVo.setProductName(productInfo.getProductName());
				productInfoVo.setProductPrice(productInfo.getProductPrice());
				prductInfoVoList.add(productInfoVo);
			}
		}
		productVo.setProductInfoVoList(prductInfoVoList);
		productVoList.add(productVo);
	  }
	return ResultVoUtil.success(productVoList);
	}
   
}
