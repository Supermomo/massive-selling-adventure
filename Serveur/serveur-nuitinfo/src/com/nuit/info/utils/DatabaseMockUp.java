package com.nuit.info.utils;

import java.util.ArrayList;
import java.util.HashMap;

import com.nuit.info.models.Message;
import com.nuit.info.models.User;
import com.nuit.info.models.Room;

public class DatabaseMockUp {

	private static DatabaseMockUp instance = new DatabaseMockUp();
	
	private HashMap<String, User> userList;
	private HashMap<String, User> connectedUser;
	
	private ArrayList<Message> messages;
	
	private Room room;
	
	private DatabaseMockUp() {
		userList = new HashMap<String, User>();
		connectedUser = new HashMap<String, User>();
		messages = new ArrayList<Message>();
		userList.put("test", new User("test", "test"));
		userList.put("test2", new User("test2", "kikoo"));
		room = new Room();
		ArrayList<String> buyers = new ArrayList<String>();
		buyers.add("test");
		buyers.add("test2");
		room.setBuyers(buyers);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("test", "Je voudrais acheter une base de donnees");
		map.put("test2", "Je voudrais acheter un matelas");
		room.setAnnounces(map);
	}
	
	public HashMap<String, User> getUserList() {
		return userList;
	}
	
	public HashMap<String, User> getConnectedUsers() {
		return connectedUser;
	}
	
	public ArrayList<Message> getMessages() {
		return messages;
	}
	
	public Room getRoom() {
		return room;
	}
	
	public static DatabaseMockUp getInstance() {
		return instance;
	}
}
