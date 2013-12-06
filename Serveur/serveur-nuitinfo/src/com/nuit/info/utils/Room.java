package com.nuit.info.utils;

import java.util.ArrayList;


public class Room {
	private String theme;
	private String adresse;
	private ArrayList<String> listePersonne;
	
	
	public Room(String theme, String adresse, ArrayList<String> listePersonne){
		this.theme = theme;
		this.adresse = adresse;
		this.listePersonne = listePersonne;
		
	}
	
	public String toString(){
		String message = "Theme : " + theme + " ; adresse : " + adresse + " liste personne : [ ";
		for(int i = 0 ; i<listePersonne.size(); i++){
			message = message + " " +listePersonne.get(i);
		}
		message = message + " ]";
		return message;
	}
}
