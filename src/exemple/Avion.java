package exemple;

public class Avion extends Vehicule {
	
	private String matricule;
	
	@Override
	public void demarrer() {
		//TODO a coder
		System.out.println("je suis un avion et je démarre");
	}
	
	public void decoller() {
		
	}
	
	@Override
	public String toString() {
		return matricule+" "+modele+" "+marque;		
	}
	
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	
}
