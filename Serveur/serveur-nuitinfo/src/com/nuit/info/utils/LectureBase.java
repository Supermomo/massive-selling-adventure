package com.nuit.info.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.nuit.info.models.User;


public class LectureBase {
	ArrayList<User> listePersonne;
	ArrayList<Room> listeRooms;
	ArrayList<Avatar> avatar;
	Server serveur;
	
	public LectureBase(String cheminFichier) throws IOException{
		String lecture = "";
		String theme;
		String adresseR;
		int numCharactere;


		ArrayList<User> listePersonne = new ArrayList<User>();
		listeRooms = new ArrayList<Room>();
		ArrayList<String> nomPersonne = new ArrayList<String>();
		ArrayList<String> cheminImage = new ArrayList<String>();
		this.avatar = new ArrayList<Avatar>();

		File fichier = new File(cheminFichier);
		FileReader ficRead;
		try {
			ficRead = new FileReader(fichier);
			BufferedReader buff = new BufferedReader(ficRead);



			lecture = buff.readLine();
			
			do {
				
				if(lecture.equals("Person :")){
					listePersonne.add(new User(buff.readLine(), buff.readLine(), buff.readLine(), Integer.parseInt(buff.readLine()), Boolean.parseBoolean(buff.readLine())));
					System.out.println(listePersonne.get(listePersonne.size()-1));
					
				}
				lecture = buff.readLine();
				if(lecture !=null && lecture.equals("Room :")){
					theme = buff.readLine();
					adresseR = buff.readLine();
					lecture = buff.readLine();
					
					nomPersonne.clear();
					while(!lecture.equals("")){
						nomPersonne.add(lecture);
						lecture = buff.readLine();
					}
					listeRooms.add(new Room(theme, adresseR, nomPersonne));
					System.out.println(listeRooms.get(listeRooms.size()-1));
					
				}
				
				if(lecture !=null && lecture.equals("Avatar :")){
					numCharactere = Integer.parseInt(buff.readLine());
					lecture = buff.readLine();
					cheminImage.clear();
					while(!lecture.equals("")){
						
						cheminImage.add(lecture);
						lecture = buff.readLine();
					}
					this.avatar.add(new Avatar(numCharactere, cheminImage));
					System.out.println(avatar.get(avatar.size()-1));
				}
				if(lecture !=null && lecture.equals("Server :")){
					this.serveur = new Server(buff.readLine());
					System.out.println(serveur);
				}
			} while (lecture != null);
			
			buff.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	public ArrayList<User> getListePersonne() {
		return listePersonne;
	}

	public void setListePersonne(ArrayList<User> listePersonne) {
		this.listePersonne = listePersonne;
	}
}
