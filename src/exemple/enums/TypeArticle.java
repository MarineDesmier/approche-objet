package exemple.enums;

public enum TypeArticle {
	// une enum doit avoir au moins une instance
	// ici, 2 instances de TypeArticle disponible
	LIVRE("A01", "Livre"),
	JEU("B12", "Jeu de société");
	
	private String reference;
	private String description;
	
	/**
	 * @param reference
	 * @param description
	 */
	private TypeArticle(String reference, String description) {
		this.reference = reference;
		this.description = description;
	}

	public String getReference() {
		return reference;
	}

	public String getDescription() {
		return description;
	}
	
	
}
