package utils;

public class TestMethodeStatic {
	
	public static String chaine = "12";

	int a = 6;
	int b = 17;
	
	public static void main(String[] args) {
		
		// méthode pour convertir une chaine de caractère en entier 
		int chaineEntier = Integer.parseInt(chaine);
		 System.out.println(chaineEntier);
		 
		 
		 // Utiliser une methode de integer pour calculer le nombre maxi entre a et b
		 int maxi = Integer.max(6, 17);
		 System.out.println(maxi);
		 System.out.println(Integer.MAX_VALUE);
	}

}
