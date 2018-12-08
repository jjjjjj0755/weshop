package com.jluzh.Enum;

public enum PayStatusEnum {

	WAIT(0,"等待支付"),
	SUCCESS(1,"支付成功");
	
private int code;
	
    private String mes;
    
    PayStatusEnum(int code,String mes){
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
