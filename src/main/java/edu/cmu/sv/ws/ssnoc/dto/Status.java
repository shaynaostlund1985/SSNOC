package edu.cmu.sv.ws.ssnoc.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;

public class Status {
	
	private static String DATE_FORMAT = "YYYY-MM-DD HH:mm";

	private String updatedAt;
	
	private int statusCode;
	
	private Location location;
	
	public Date getUpdatedAtDate() {
		try {
			return new SimpleDateFormat(DATE_FORMAT).parse(getUpdatedAt());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void setUpdatedAtDate(Date updatedAt){
		this.updatedAt = new SimpleDateFormat(DATE_FORMAT).format(updatedAt);
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
