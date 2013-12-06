package com.nuit.info.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.datanucleus.util.Log4JLogger;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.nuit.info.models.Message;
import com.nuit.info.models.User;
import com.nuit.info.utils.DatabaseMockUp;

@Path("/chat")
public class ChatResource {
	
	private DatabaseMockUp database = DatabaseMockUp.getInstance();

	@POST
	@Consumes("application/json")
	public void post(String s) {
		String username = null;
		String message = null;
		try {
			JSONObject object = new JSONObject(s);
			username = object.getString("username");
			message = object.getString("message");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		Message msg = new Message();
		msg.setUsername(username);
		msg.setMessage(message);
		database.getMessages().add(msg);
	}
}
