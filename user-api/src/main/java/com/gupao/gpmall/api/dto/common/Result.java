package com.gupao.gpmall.api.dto.common;

import java.io.Serializable;

public class Result<T> implements Serializable{


	private static final long serialVersionUID = 8900447065402159843L;
	private T result;
	
	private boolean status;
	
	private String message;
	
	public Result() {}
	
	public Result(boolean status, String message, T result) {
		this.status = status;
		this.message = message;
		this.result = result;
	}
	
	public static <T> Result<T> success(T result){
		return new Result<T>(true,"操作成功",result);
	}
	
	/**
	 * 
	 * @return
	 * {<br>
    	"result": null,<br>
    	"status": true,<br>
    	"message": "操作成功",<br>
    	"__zto": true<br>
		}
	 */
	public static Result success() {
		return success(null);
	}
	
	public static <T> Result<T> error(String message){
		return new Result(false,message,null);
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
