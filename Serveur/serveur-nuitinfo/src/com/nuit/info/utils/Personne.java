package com.nuit.info.utils;


public class Personne {
	private String pseudonyme;
	private String adresseMail;
	private String mdp;
	private int numCaractere;
	private boolean vendeur;
	
	public Personne(String pseudonyme, String adresseMail, String mdp, int numCaractere, boolean vendeur){
		this.pseudonyme = pseudonyme;
		this.adresseMail = adresseMail;
		this.mdp = mdp;
		this.numCaractere = numCaractere;
		this.vendeur = vendeur;
	}
	
	public String toString(){
		String message = "Pseudo : " + pseudonyme + " ; mail : " + adresseMail + " ; mdp : " +
				mdp + " ; caractere : "  + numCaractere + "; vendeur : "+vendeur;
		
		return message;
	}
}
