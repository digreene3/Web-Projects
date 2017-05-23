package flashcards.object;

// TODO: Auto-generated Javadoc
/**
 * The Class FlashCard.
 */
public class FlashCard {

	/** The id. */
	private int id;
	
	/** The flash card set ID. */
	private int setID;
	
	/** The term. */
	private String term;
	
	/** The definition. */
	private String definition;

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
	 * Gets the flash card set ID.
	 *
	 * @return the flash card set ID
	 */
	public int getSetID() {
		return setID;
	}

	/**
	 * Sets the flash card set ID.
	 *
	 * @param setID the new flash card set ID
	 */
	public void setSetID(int setID) {
		this.setID = setID;
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
	 * @param term the new term
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
	 * @param definition the new definition
	 */
	public void setDefinition(String definition) {
		this.definition = definition;
	}
}
