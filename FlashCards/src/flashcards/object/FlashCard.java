package flashcards.object;



// TODO: Auto-generated Javadoc
/**
 * The Class FlashCard.
 */
public class FlashCard {

	/** The id. */
	private int id;

	/** The flash card set ID. */
	private int topicID;

	/** The term. */
	private String term;

	/** The definition. */
	private String definition;
	
	/** The color ID. */
	private int colorID;
	
	private String color;

	/**
	 * Instantiates a new flash card.
	 *
	 * @param id the id
	 * @param topicID the topic ID
	 * @param term the term
	 * @param definition the definition
	 * @param colorID the color ID
	 */
	public FlashCard(int id, int topicID, String term, String definition, int colorID){
		setID(id);
		settopicID(topicID);
		setColorID(colorID);
		setDefinition(definition);
		setTerm(term);
		setColor(Colors.color(colorID));
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setID(int id){
		this.id = id;
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
	 * @param id
	 *            the new id
	 */
	public void topicID(int id) {
		this.id = id;
	}

	/**
	 * Gets the flash card set ID.
	 *
	 * @return the flash card set ID
	 */
	public int gettopicID() {
		return topicID;
	}

	/**
	 * Sets the flash card set ID.
	 *
	 * @param topicID
	 *            the new flash card set ID
	 */
	public void settopicID(int topicID) {
		this.topicID = topicID;
	}

	/**
	 * Gets the term.
	 *
	 * @return the term
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * Sets the term.
	 *
	 * @param term
	 *            the new term
	 */
	public void setTerm(String term) {
		this.term = term;
	}

	/**
	 * Gets the definition.
	 *
	 * @return the definition
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * Sets the definition.
	 *
	 * @param definition
	 *            the new definition
	 */
	public void setDefinition(String definition) {
		this.definition = definition;

	}

	/**
	 * Gets the color ID.
	 *
	 * @return the color ID
	 */
	public int getColorID() {
		return colorID;
	}

	/**
	 * Sets the color ID.
	 *
	 * @param colorID the new color ID
	 */
	public void setColorID(int colorID) {
		this.colorID = colorID;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
