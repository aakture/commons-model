package com.alper.commons.model;

public abstract class Response {
	private boolean success;
	private ErrorCode errorCode;
	public Response(boolean success) {
		this.success = success;
	}
	public Response(ErrorCode errorCode) {
		this.success = false;
		this.errorCode = errorCode;
	}
	public boolean isSuccess() {
		return success;
	}
	public ErrorCode getErrorCode() {
		return errorCode;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
}
