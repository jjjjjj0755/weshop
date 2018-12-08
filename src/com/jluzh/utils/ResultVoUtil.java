package com.jluzh.utils;

import com.jluzh.Vo.ResultVo;

public class ResultVoUtil {

	public static <T> ResultVo<T> success(T object){
		ResultVo<T> rs=new ResultVo<T>();
		rs.setCode(0);
		rs.setMes("³É¹¦");
		rs.setData(object);
		return rs;
	}
}
