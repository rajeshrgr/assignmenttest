package com.assignment.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Team {
	
	public static void main(String[] args) {
		String jsonBody = Util.readFile("C:\\Users\\Rajesh G\\Documents\\workspace\\JSON file\\RCBPlayers.json").toString();
	//	System.out.println(jsonBody);
		int foreignPlayersCunt =0;
		int wicketKeeperCount =0;
		try {
			JSONObject object1 = Util.ConvertJsonStringToJsonObject(jsonBody);
			String players = object1.get("player").toString();
	        JSONArray JsonPlayers = object1.getJSONArray("player");
		    for (int i = 0; i < JsonPlayers.length(); i++) { 
	            JSONObject explrObject = JsonPlayers.getJSONObject(i);   
	            if(!explrObject.get("country").equals("India")) {
	            	++foreignPlayersCunt;
	            }  
	            if(explrObject.get("role").equals("Wicket-keeper")) {
	            	++wicketKeeperCount;
	            }  
	        }      
		    System.out.println("foreighn players="+foreignPlayersCunt); 
		    System.out.println("Wicket-keeper="+wicketKeeperCount); 
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}}