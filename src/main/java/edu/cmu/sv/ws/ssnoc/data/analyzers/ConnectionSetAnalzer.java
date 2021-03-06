package edu.cmu.sv.ws.ssnoc.data.analyzers;

import java.util.HashSet;
import java.util.Set;

public class ConnectionSetAnalzer {

	Set<String> superUserSet;
	
	public void loadUsers(Set<String> users) {
		this.superUserSet = users;		
	}

	public Set<Set<String>> getConnectedSets() {
		Set<Set<String>> connectedSets = new HashSet<Set<String>>();
		connectedSets.add(superUserSet);
		return connectedSets;
	}

	public Set<String> processConnection(UserConnections user) {
		Set<String> users = new HashSet<String>(superUserSet);
		for(String connection : user.getConnections()){
			users.remove(connection);
		}
		return users;
	}

}
