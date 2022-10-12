package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compte[] compteTab = new Compte[2];
		compteTab[0] = new CompteTaux(500766, 1000, 0.75);
		compteTab[1] = new CompteTaux(568984, 15000, 1.5);
		
		for(int i = 0; i < compteTab.length; i++) {
			System.out.println(compteTab[i]);
		}
	}

}
