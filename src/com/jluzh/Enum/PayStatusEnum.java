package com.jluzh.Enum;

public enum PayStatusEnum {

	WAIT(0,"�ȴ�֧��"),
	SUCCESS(1,"֧���ɹ�");
	
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
