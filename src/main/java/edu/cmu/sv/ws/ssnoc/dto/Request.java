package edu.cmu.sv.ws.ssnoc.dto;

import java.util.List;

public class Request {
	private long requestId;
	private long requesterId;
	private String username;
	private List<String> type;
	private String created_at;
	private String updated_at;
	private String location;
	private String description;
	private String status;
	private String resolutionDetails;
	private List<Responder> responders;
	public final static String DEFAULT_STATUS = "Pending";
	
	public long getRequestId() {
		return requestId;
	}
	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}
	public long getRequesterId() {
		return requesterId;
	}
	public void setRequesterId(long requesterId) {
		this.requesterId = requesterId;
	}
	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResolutionDetails() {
		return resolutionDetails;
	}
	public void setResolutionDetails(String resolutionDetails) {
		this.resolutionDetails = resolutionDetails;
	}
	public List<Responder> getResponders() {
		return responders;
	}
	public void setResponders(List<Responder> responders) {
		this.responders = responders;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
