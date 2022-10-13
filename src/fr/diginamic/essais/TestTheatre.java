package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre = new Theatre("le petit théatre", 100);
		
		theatre.inscrire(10, 30.5);
		System.out.println(theatre.toString());
		theatre.inscrire(50, 30.5);
		System.out.println(theatre.toString());
		theatre.inscrire(40, 30.5);
		System.out.println(theatre.toString());
		
		theatre.inscrire(5, 30.5);
		System.out.println(theatre.toString());
		
	}

}
