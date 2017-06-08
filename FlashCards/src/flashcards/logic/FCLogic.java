package flashcards.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import flashcards.object.Deck;
import flashcards.object.User;
import flashcards.persistence.FCPersist;

public class FCLogic {

	private User user;
	private FCPersist fpc;
	private ArrayList<Deck> decks;
	private ResultSet rs;

	public FCLogic() {
		user = new User();
		fpc = new FCPersist();
		decks = new ArrayList<Deck>();

	}

	public void createNewSet(String topic, String color) {
		fpc.newSet(topic, "user1",color);
	}
	
	public ArrayList<Deck> getDecks(){
		rs = fpc.getDecks();
		try {
			while(rs.next()){
				String topic = rs.getString("topic");
				String color = rs.getString("color");
				Deck deck = new Deck(topic, color);
				decks.add(deck);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return decks;
	}
}
