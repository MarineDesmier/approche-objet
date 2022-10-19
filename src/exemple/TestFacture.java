package exemple;

public class TestFacture {

	public static void main(String[] args) {
//		Facture f = new Facture(100);
//		System.out.println(f.getConsommationKwh()+" "+f.getMontant());
//
//		f.modifierConsommation(150.0);
//		System.out.println(f.getConsommationKwh()+" "+f.getMontant());
		
		String ch1 = "Bonjour"; // Cette chaine '"bonjour" va être versée dans le string pool à l'adresse mémoire A0B005
		String ch2 = new String("Bonjour"); // Je n'utilise plus le mécanisme de string pool
		 
		if(ch1 == ch2) { // ==, fontionne uniquement si ch1 et ch2 référencent la même zone mémoire
			System.out.println("les chaines sont identiques");
		}
		else {
			System.out.println("les chaines sont différente");
		}
		// Conclusion : EQUALS pour tous les objets
		
		Integer a = 200; // Integer pool jusqu'à 127
		Integer b = 200;
		
		if(a == b) { // ==, fontionne uniquement si ch1 et ch2 référencent la même zone mémoire
			System.out.println("a et b sont identiques");
		}
		else {
			System.out.println("a et b sont différente");
		}
		// Conclusion ENCORE : EQUALS pour tous les objets et == pour les types primitifs
		
		int cpt = 115;
		StringBuilder builder = new StringBuilder();
		builder.append("Bonjour à tous, Nous sommes ").append(cpt);
		System.out.println(builder);
				
		
		
	}

}
