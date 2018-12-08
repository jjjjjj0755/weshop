package com.jluzh.Controller;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.Service.BuyerProductService;
import com.jluzh.ServiceImpl.BuyerProductServiceImpl;
import com.jluzh.Vo.ProductInfoVo;
import com.jluzh.Vo.ProductVo;
import com.jluzh.Vo.ResultVo;

public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doPost(req,resp);
	}

//自定义json格式
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		    resp.setContentType("text/html;charset=utf-8");
			BuyerProductService buyerProduct=new BuyerProductServiceImpl();
			ResultVo<ArrayList<ProductVo>> r=buyerProduct.findUpProduct();
			if(r!=null){
				StringBuilder sb=new StringBuilder();
				sb=sb.append("{\"code\":"+r.getCode()+",\"mes\":\""+r.getMes()+"\",\"data\":[");
			   Writer out = resp.getWriter();
			   int i=0,k=0;
			   for(ProductVo productVo:r.getData()){
				   if(k!=0)
			    		  sb.append(",");
				   i=0;
				   sb.append("{\"name\":\""+productVo.getCategoryName()+"\",\"Jurl\":\""+productVo.getCategoryUrl()+"\",\"type\":"+
				   productVo.getCategoryType()+",\"data\":[");
			      for(ProductInfoVo productInfoVo:productVo.getProductInfoVoList()){
			    	  if(i!=0)
			    		  sb.append(",");
			    	sb.append("{\"id\":\""+productInfoVo.getProductId()+"\",\"name\":\""+
			    		productInfoVo.getProductName()+"\",\"price\":"+
			    		productInfoVo.getProductPrice()+",\"description\":\""+
			    		productInfoVo.getProductDescription()+"\",\"icon\":\""+
			    		productInfoVo.getProductIcon()+"\"}");  
			    	i++;
			      }
			      k++;
			      sb.append("]}");
			   }
			   sb.append("]}");
			   out.write(sb.toString());
			}
	}


}
