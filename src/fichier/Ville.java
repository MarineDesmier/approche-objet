package fichier;

public class Ville {
	private String nom;
	private String codeDep;
	private String nomRegion;
	private int popTotal;
	
	/**
	 * @param nom
	 * @param codeDep
	 * @param nomRegion
	 * @param popTotal
	 */
	public Ville(String nom, String codeDep, String nomRegion, int popTotal) {
		super();
		this.nom = nom;
		this.codeDep = codeDep;
		this.nomRegion = nomRegion;
		this.popTotal = popTotal;
	}

	@Override
	public String toString() {
		return "Ville = " + nom + ", code Département = " + codeDep + ", nom Région = " + nomRegion + ", population Total = " + popTotal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopTotal() {
		return popTotal;
	}

	public void setPopTotal(int popTotal) {
		this.popTotal = popTotal;
	}
	
	
}
