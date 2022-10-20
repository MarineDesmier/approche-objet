package exemple;

import java.util.Objects;
	//                    Contrainte sur U
public class Conteneur<T, U extends Vehicule> { // T et U sont des valeurs génériques
	private T identifiant;
	private U valeur;
	
	/**
	 * @param identifiant
	 * @param valeur
	 */
	public Conteneur(T identifiant, U valeur) {
		super();
		this.identifiant = identifiant;
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "Conteneur [identifiant=" + identifiant + ", valeur=" + valeur + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(identifiant, valeur);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conteneur other = (Conteneur) obj;
		return Objects.equals(identifiant, other.identifiant) && Objects.equals(valeur, other.valeur);
	}

	public T getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(T identifiant) {
		this.identifiant = identifiant;
	}

	public U getValeur() {
		return valeur;
	}

	public void setValeur(U valeur) {
		this.valeur = valeur;
	}
	
}
