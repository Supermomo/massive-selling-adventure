package com.nuit.info.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.nuit.info.models.User;
import com.nuit.info.utils.DatabaseMockUp;

@Path("/mail")
public class MailResource {
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public void login(String s) {
		String username = null;
		String buyer = null;
		String objet = null;
		String message = null;
		try {
			JSONObject object = new JSONObject(s);
			username = object.getString("username");
			buyer = object.getString("buyer");
			objet = object.getString("object");
			message = object.getString("message");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		//TODO Send mail
	}

}