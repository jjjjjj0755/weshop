package com.jluzh.Enum;

public enum ProductStatusEnum {

	UP(0,"�ϼ�"),
	DWON(1,"�¼�");
	
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
