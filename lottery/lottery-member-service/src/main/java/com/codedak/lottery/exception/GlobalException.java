package com.codedak.lottery.exception;

public class GlobalException extends Exception {
	
    private String code;//错误码
    private String message;//错误消息
    
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GlobalException(String code,String message) {
		super(message);
    	this.code=code;
    }
}
