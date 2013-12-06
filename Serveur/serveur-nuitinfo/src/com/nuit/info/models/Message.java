package com.nuit.info.models;

public class Message {
	
	private String username;
	private String message;
	
	public Message() {
		username = "";
		message = "";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
