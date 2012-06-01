package com.alper.commons.model;

public class LoginResponse extends Response {
	private String username;
	private String sessionId;

	public LoginResponse() {
		super(true);
	}
	
	public LoginResponse(ErrorCode errorCode) {
		super(errorCode);
		setSessionId();
	}
	private void setSessionId() {
		this.sessionId = ""+System.currentTimeMillis();
		
	}
	public LoginResponse(String username) {
		super(true);
		this.username = username;
		setSessionId();
	}
	public String getUsername() {
		return username;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	
}
