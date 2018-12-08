package com.jluzh.Enum;

public enum ProductStatusEnum {

	UP(0,"ио╪э"),
	DWON(1,"об╪э");
	
	private int code;
	private String mes;
	
	ProductStatusEnum(int code,String mes){
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
