package com.jluzh.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.DTO.OrderDTO;


public class postFormServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doPost(req,resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			String name=req.getParameter("name");
			String phone=req.getParameter("phone");
			String address=req.getParameter("address");
			String userName=req.getParameter("userName");
			OrderDTO orderDto=new OrderDTO();
			orderDto.setBuyerName(name);
			orderDto.setBuyerPhone(phone);
			orderDto.setBuyerAddress(address);
			orderDto.setUserName(userName);
			
	}


}
