package com.nuit.info.utils;

public class Server {
	String adresse;
	
	public Server(String adresse){
		this.adresse = adresse;
	}

	public String toString() {
		
		return "Adresse : "+  adresse;
	}
}
