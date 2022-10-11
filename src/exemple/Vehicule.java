package exemple;

public class Vehicule {
	
	protected String marque;
	protected String modele;
	
	public void demarrer() {
		//TODO a coder
		System.out.println("je suis un véhicule et je démarre");
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}
	
}
