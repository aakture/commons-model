package com.alper.commons.model;

public class EnterRoomResponse extends Response{
	private String roomName;
	public EnterRoomResponse(String roomName) {
		super(true);
		this.roomName = roomName;
	}
	public EnterRoomResponse(ErrorCode errorCode) {
		super(errorCode);
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
}
