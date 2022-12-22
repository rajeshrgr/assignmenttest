package com.assignment.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

public class Util {
	public static String json= "";
	

	//Convert Json file to Json String
			public static String JSonFiletoJsonString(String JsonFile) {
				try {
					Gson gson = new Gson(); 
					json = gson.toJson(JsonFile); 
				}catch (Exception e) {
					 e.printStackTrace();
				}
				return json;
			}
			
	//read from the json and send that as a string
			public static String generateStringFromResource(String path) throws IOException {

			    return new String(Files.readAllBytes(Paths.get(path)));

			}
			public static String readFile(String filename) {
			    String result = "";
			    try {
			        BufferedReader br = new BufferedReader(new FileReader(filename));
			        StringBuilder sb = new StringBuilder();
			        String line = br.readLine();
			        while (line != null) {
			            sb.append(line);
			            line = br.readLine();
			        }
			        result = sb.toString();
			    } catch(Exception e) {
			        e.printStackTrace();
			    }
			    return result;
			}
		
		//Convert Json String to Objecct
			public static JSONObject ConvertJsonStringToJsonObject(String json) throws JSONException {
				JSONObject childjson = new JSONObject(json);
				return childjson;
			}
}
