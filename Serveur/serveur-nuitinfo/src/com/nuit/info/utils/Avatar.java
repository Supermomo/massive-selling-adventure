package com.nuit.info.utils;

import java.util.ArrayList;


public class Avatar {
	int numCharact;
	ArrayList<String> cheminImages;
	
	public Avatar(int numCharact , ArrayList<String> listeImage){
		this.numCharact = numCharact;
		cheminImages = listeImage;
		
	}
	
	public String toString(){
		String message = "Numero : " + numCharact + " ; Images : [";
		for(int i = 0 ; i<cheminImages.size(); i++){
			message = message + " " +cheminImages.get(i);
		}
		message = message + " ]";
		return message;
	}
}
