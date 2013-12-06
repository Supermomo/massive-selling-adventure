package com.nuit.info.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.nuit.info.utils.DatabaseMockUp;

@Path("/interaction")
public class InteractionResource {
	
	private DatabaseMockUp database = DatabaseMockUp.getInstance();
	
	@GET
	@Path("/listBuyers")
	@Produces("application/json")
	@Consumes("application/json")
	public String listBuyers() {
		StringBuilder sb = new StringBuilder();
		sb.append("{[");
		for(String s : database.getRoom().getBuyers()) {
			sb.append(s);
			sb.append(",");
		}
		sb.append("]}");
		return sb.toString();
	}
	
	@POST
	@Path("/getAnnounce")
	@Produces("application/json")
	@Consumes("application/json")
	public String getAnnounce(String s) {
		String announce = null;
		try {
			JSONObject object = new JSONObject(s);
			announce = database.getRoom().getAnnounces().get(object.getString("buyer"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return announce;
	}
	
	@POST
	@Path("/becomeBuyer")
	@Produces("application/json")
	@Consumes("application/json")
	public void becomeBuyer(String s) {
		String announce = null;
		String buyer = null;
		try {
			JSONObject object = new JSONObject(s);
			buyer = object.getString("buyer");
			announce = object.getString("announce");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		database.getRoom().getBuyers().add(buyer);
		database.getRoom().getAnnounces().put(buyer, announce);
	}
}
