package com.jluzh.Service;

import java.util.ArrayList;
import java.util.Map;

import com.jluzh.DTO.DetailDTO;
import com.jluzh.DTO.OrderDTO;
import com.jluzh.Vo.ResultVo;

public interface BuyerOrderService {

	//创建订单(表单验证)
	public ResultVo<Map<String,String>> create(OrderDTO orderDto);
	
	//订单列表
	public ArrayList<OrderDTO> list(String userName);
	
	//订单详情
	public ArrayList<DetailDTO> orderDetail(String orderId);
	
	//取消订单
	public ResultVo cancel();
}
