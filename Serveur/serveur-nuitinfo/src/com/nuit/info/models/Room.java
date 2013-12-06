package com.nuit.info.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
	
	private ArrayList<String> buyers;
	private ArrayList<String> sellers;
	
	private HashMap<String, String> announces;
	
	public Room() {}

	public ArrayList<String> getBuyers() {
		return buyers;
	}

	public void setBuyers(ArrayList<String> buyers) {
		this.buyers = buyers;
	}

	public ArrayList<String> getSellers() {
		return sellers;
	}

	public void setSellers(ArrayList<String> sellers) {
		this.sellers = sellers;
	}

	public HashMap<String, String> getAnnounces() {
		return announces;
	}

	public void setAnnounces(HashMap<String, String> announces) {
		this.announces = announces;
	}
}
