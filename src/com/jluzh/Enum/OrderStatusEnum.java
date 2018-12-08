package com.jluzh.Enum;

public enum OrderStatusEnum {

	NEW(0,"完成"),
	FINISH(1,"已完成"),
	CANCEL(2,"已取消");
	
	private int code;
	
    private String mes;
    
    OrderStatusEnum(int code,String mes){
    	this.code=code;
    	this.mes=mes;
    }

	public int getCode() {
		return code;
	}

	public String getMes() {
		return mes;
	}
    
    
}
