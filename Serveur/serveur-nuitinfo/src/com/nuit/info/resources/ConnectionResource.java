package com.nuit.info.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.datanucleus.util.Log4JLogger;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.nuit.info.models.User;
import com.nuit.info.utils.DatabaseMockUp;

@Path("/connection")
public class ConnectionResource {
	
	private DatabaseMockUp database = DatabaseMockUp.getInstance();

	@POST
	@Path("/login/")
	@Produces("application/json")
	@Consumes("application/json")
	public String login(String s) {
		String username = null;
		String password = null;
		try {
			JSONObject object = new JSONObject(s);
			username = object.getString("username");
			password = object.getString("password");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		User user = database.getUserList().get(username);
		if(user == null) {
			return "{\"return\":false}";
		}
		
		if(user.getPassword().equals(password)) {
			database.getConnectedUsers().put(user.getUsername(), user);
			return "{\"return\":true}";
		}
		return "{\"return\":false}";
	}
	
	@POST
	@Path("/logout/")
	@Consumes("application/json")
	public void logout(String s) {
		String username = null;
		try {
			JSONObject object = new JSONObject(s);
			username = object.getString("username");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		database.getConnectedUsers().remove(username);
	}
	
	@POST
	@Path("/register/")
	@Produces("application/json")
	@Consumes("application/json")
	public String register(String s) {
		String username = null;
		String password = null;
		String mail = null;
		int image = 0;
		
		try {
			JSONObject object = new JSONObject(s);
			username = object.getString("username");
			password = object.getString("password");
			mail = object.getString("mail");
			image = object.getInt("character");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setMail(mail);
		user.setImage(image);
		if(database.getUserList().containsKey(username)) {
			return "false" + username;
		}
		database.getUserList().put(username, user);
		return "true" + username;
	}
}
