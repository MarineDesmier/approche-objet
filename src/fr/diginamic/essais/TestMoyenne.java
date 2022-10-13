package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		double[] tabMoy = new double[] {5, 6, 3, 2.5};
		
		System.out.println("Note : " + tabMoy[1]); // verifier la 1ere entrée dui tableau
		
		CalculMoyenne tabMoy2 = new CalculMoyenne(tabMoy);
		System.out.println("Le moyenne est de " + tabMoy2.calcul());
		tabMoy2.ajout(7.5);
		System.out.println("Le moyenne après ajout est de " + tabMoy2.calcul());
	}

}
