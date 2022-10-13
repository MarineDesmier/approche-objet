package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cercle c3 = CercleFactory.returnCercle(8);
		Cercle[] cercles = {new Cercle(17), new Cercle(6), c3 };
		
			for(Cercle rond : cercles) {
				System.out.println(rond);
			}
		
	}

}
