package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// avec StringBuilder
		
		long debut = System.currentTimeMillis(); 
		
		StringBuilder builder = new StringBuilder();
		for(int i = 1; i <= 1000000; i++) {
			builder.append(i);
		}
		long fin = System.currentTimeMillis(); 
		System.out.println("Temps écoulé en millisecondes avec StringBuilder :" + (fin - debut) + " ms");

		// avec String
		
		long debut2 = System.currentTimeMillis(); 
		
		String string = "";
		for(int i = 1; i <= 1000000; i++) {
			string += i;
		}
		
		long fin2 = System.currentTimeMillis(); 
		System.out.println("Temps écoulé en millisecondes avec String :" + (fin2 - debut2) + " ms");
	}
}
