package com.jluzh.DBConnnect;


import java.util.ArrayList;

import com.jluzh.DTO.CartDTO;
import com.jluzh.Dao.ProductInfo;

public interface ProductInfoDB {
	
	//����db�ҳ�productInfo
	public ProductInfo findByProductId(String productId);
	
	//��ȡ�ϼ���Ʒ�б�
	public ArrayList<ProductInfo> upProductList();
	
	//���ٿ��
	public void decreaseStock(ArrayList<CartDTO> cartDtoList);
}
