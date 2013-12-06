package com.nuit.info.models;

public class User {
	
	int id;
	String username;
	String password;
	String mail;
	int image;
	boolean isVendor;
	
	public User() {
		username = "";
		password = "";
		mail = "";
		image = 0;
		isVendor = false;
	}
	
	public User(String username, String password) {
		this();
		this.username = username;
		this.password = password;
	}
		
	public User(String username, String password, String mail,
			int image, boolean isVendor) {
		super();
		this.username = username;
		this.password = password;
		this.mail = mail;
		this.image = image;
		this.isVendor = isVendor;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getImage() {
		return image;
	}
	public void setImage(int image) {
		this.image = image;
	}

	public boolean isVendor() {
		return isVendor;
	}

	public void setVendor(boolean isVendor) {
		this.isVendor = isVendor;
	}
}
