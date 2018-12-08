package com.jluzh.Service;

import java.util.ArrayList;
import java.util.Map;

import com.jluzh.DTO.DetailDTO;
import com.jluzh.DTO.OrderDTO;
import com.jluzh.Vo.ResultVo;

public interface BuyerOrderService {

	//��������(����֤)
	public ResultVo<Map<String,String>> create(OrderDTO orderDto);
	
	//�����б�
	public ArrayList<OrderDTO> list(String userName);
	
	//��������
	public ArrayList<DetailDTO> orderDetail(String orderId);
	
	//ȡ������
	public ResultVo cancel();
}
