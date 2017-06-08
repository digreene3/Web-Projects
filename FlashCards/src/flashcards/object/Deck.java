package flashcards.object;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Deck.
 */
public class Deck {

	/** The id. */
	private int id;
	
	/** The topic. */
	private String topic;
	
	/** The user ID. */
	private int userID;
	
	/** The deck. */
	private ArrayList<FlashCard> deck;
	
	/** The color. */
	private String color;
	
	/**
	 * Instantiates a new deck.
	 */
	public Deck(){
		deck = new ArrayList<FlashCard>();
	}

	/**
	 * Instantiates a new deck.
	 *
	 * @param topic the topic
	 */
	public Deck(String topic,String color){
		deck = new ArrayList<FlashCard>();
		setTopic(topic);
		setColor(color);
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the topic.
	 *
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * Sets the topic.
	 *
	 * @param topic the new topic
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * Gets the user ID.
	 *
	 * @return the user ID
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * Sets the user ID.
	 *
	 * @param userID the new user ID
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	 * Gets the deck.
	 *
	 * @return the deck
	 */
	public ArrayList<FlashCard> getDeck() {
		return deck;
	}

	/**
	 * Sets the deck.
	 *
	 * @param deck the new deck
	 */
	public void setDeck(ArrayList<FlashCard> deck) {
		this.deck = deck;
	}

	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
