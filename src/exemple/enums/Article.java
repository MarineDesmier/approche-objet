package exemple.enums;

public class Article {
	
	private TypeArticle type;
	private int identifiant;
	private String titre;
	
	/**
	 * @param type
	 * @param identifiant
	 * @param titre
	 */
	public Article(TypeArticle type, int identifiant, String titre) {
		super();
		this.type = type;
		this.identifiant = identifiant;
		this.titre = titre;
	}

	/**
	 * Getter pour l'attribut type 
	 * @return the type
	 */
	public TypeArticle getType() {
		return type;
	}

	/**
	 * Setter pour l'attribut type
	 * @param type the type to set
	 */
	public void setType(TypeArticle type) {
		this.type = type;
	}

	/**
	 * Getter pour l'attribut identifiant 
	 * @return the identifiant
	 */
	public int getIdentifiant() {
		return identifiant;
	}

	/**
	 * Setter pour l'attribut identifiant
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * Getter pour l'attribut titre 
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * Setter pour l'attribut titre
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
}
