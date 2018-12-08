package com.jluzh.ServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.jluzh.DBConnectImpl.OrderDetailDBImpl;
import com.jluzh.DBConnectImpl.OrderMasterDBImpl;
import com.jluzh.DBConnectImpl.ProductInfoDBImpl;
import com.jluzh.DBConnnect.OrderDetailDB;
import com.jluzh.DBConnnect.OrderMasterDB;
import com.jluzh.DBConnnect.ProductInfoDB;
import com.jluzh.DTO.CartDTO;
import com.jluzh.DTO.DetailDTO;
import com.jluzh.DTO.OrderDTO;
import com.jluzh.Dao.OrderDetail;
import com.jluzh.Dao.OrderMaster;
import com.jluzh.Dao.ProductInfo;
import com.jluzh.Enum.OrderStatusEnum;
import com.jluzh.Enum.PayStatusEnum;
import com.jluzh.Service.BuyerOrderService;
import com.jluzh.Vo.ResultVo;
import com.jluzh.utils.KeyUtil;

public class BuyerOrderServiceImpl implements BuyerOrderService{

	private ProductInfoDB productInfoDBImpl;
	private OrderDetailDB orderDetailDBImpl;
	private OrderMasterDB orderMasterDBImpl;
	private BigDecimal orderAmount=new BigDecimal(0);
	private static Logger log=Logger.getLogger(Test.class.getName());
	@Override
	//��������
	public ResultVo<Map<String, String>> create(OrderDTO orderDto) {
		//2.����Ψһ������
		String orderId=KeyUtil.genUniqueKey();
		orderDetailDBImpl=new OrderDetailDBImpl();
		productInfoDBImpl=new ProductInfoDBImpl();
		orderMasterDBImpl=new OrderMasterDBImpl();
		//1.��ѯ��Ʒ������  �۸�
		for(OrderDetail orderDetail:orderDto.getOrderDetailList())
		  {
			ProductInfo productInfo=productInfoDBImpl.findByProductId(orderDetail.getProductId());
			if(productInfo==null)
				log.error("�ֿ���û�и���Ʒ");
			//3.���㶩���ܼ�
			orderAmount=productInfo.getProductPrice().multiply(orderDetail.getPrductQuantity()).add(orderAmount);
			//4.�����������
			orderDetail.setDetailId(KeyUtil.genUniqueKey());
			orderDetail.setOrderId(orderId);
			orderDetail.setProductPrice(productInfo.getProductPrice());
			orderDetail.setProductIcon(productInfo.getProductIcon());
			orderDetail.setProductName(productInfo.getProductName());
			orderDetail.setProductPrice(productInfo.getProductPrice());
			orderDetailDBImpl.saveOrderDetail(orderDetail);
		  }
		
		//д�붩�����ݿ�
		OrderMaster orderMaster=new OrderMaster();
		orderMaster.setBuyerAddress(orderDto.getBuyerAddress());
		orderMaster.setBuyerName(orderDto.getBuyerName());
		orderMaster.setOrderAmount(orderAmount);
		orderMaster.setOrderId(orderId);
		orderMaster.setUserName(orderDto.getUserName());
		orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
		orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
		orderMaster.setBuyerPhone(orderDto.getBuyerPhone());
		orderMasterDBImpl.saveOrderMaster(orderMaster);
		//5.�ۿ��
		ArrayList<CartDTO> cartDtoList=new ArrayList<CartDTO>();
		for(OrderDetail orderDetail:orderDto.getOrderDetailList()){
			CartDTO cartDto=new CartDTO(orderDetail.getProductId(),orderDetail.getPrductQuantity().intValue());
			cartDtoList.add(cartDto);
		}
		productInfoDBImpl.decreaseStock(cartDtoList);
		
		return null;
	}

	@Override
	public ArrayList<OrderDTO> list(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DetailDTO> orderDetail(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultVo cancel() {
		// TODO Auto-generated method stub
		return null;
	}

}
