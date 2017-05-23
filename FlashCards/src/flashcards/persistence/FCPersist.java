package flashcards.persistence;

import java.sql.Connection;

import com.digreene.localdatabaseaccess.DatabaseAccess;


public class FCPersist {
	private DatabaseAccess db;
	private Connection con;
	
	public FCPersist(){
		db = new DatabaseAccess("flash_cards");
		con = db.connect();
	}
	
	public void newSet(String topic, String username){
		String query = "";
		db.update(con, query);
	}
	
	public void newFlashCard(String topic, String term, String definition, int colorID){
		String query = "INSERT INTO flash_card (topicID,term,definition,color) VALUES ((SELECT id FROM set where topic = '" + topic + "'),'" + term
				+ "','" + definition + "','" + colorID + "')";
		db.update(con, query);
	}
	
}
