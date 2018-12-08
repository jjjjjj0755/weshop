package com.jluzh.Enum;

public enum OrderStatusEnum {

	NEW(0,"���"),
	FINISH(1,"�����"),
	CANCEL(2,"��ȡ��");
	
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
