package flashcards.persistence;

import java.sql.Connection;
import java.sql.ResultSet;



public class FCPersist {
	private DatabaseAccess db;
	private Connection con;
	
	public FCPersist(){
		db = new DatabaseAccess();
		con = db.connect();
	}
	
	public void newSet(String topic, String username, String color){
		String query = "INSERT into deck (topic,userID,color) VALUES ('" + topic +"', (SELECT id from user where username = '" + username + "'),'" + color + "' )";
		db.update(con, query);
	}
	
	public void newFlashCard(String topic, String term, String definition, int colorID){
		String query = "INSERT INTO flash_card (topicID,term,definition,color) VALUES ((SELECT id FROM set where topic = '" + topic + "'),'" + term
				+ "','" + definition + "','" + colorID + "')";
		db.update(con, query);
	}
	
	public ResultSet getDecks(){
		String query = "Select * from deck";
		return db.retrieve(con, query);
	}
	

	
}
