package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		ArrayList<Integer> listeNombre = new ArrayList<>();
		for(int i = 0; i <= 100; i++) {
			listeNombre.add(i);
		}
		System.out.println(listeNombre);
	}
}
