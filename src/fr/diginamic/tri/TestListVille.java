package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestListVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> listeVille =  new ArrayList<Ville>();
		listeVille.add(new Ville("Carcassonne", 47800));
		listeVille.add(new Ville("Nice",343000));
		listeVille.add(new Ville("Lyon", 484000));
		listeVille.add(new Ville("Foix", 9700));
		listeVille.add(new Ville("Pau", 77200));
		listeVille.add(new Ville("Marseille", 850700));
		listeVille.add(new Ville("Tarbes", 40600));
		
		Collections.sort(listeVille);
		
			for(Ville v : listeVille) {
				System.out.println(v);
			}
		// on mélange la liste
		Collections.shuffle(listeVille);
		
		System.out.println("-------------------------------------------");
			
		Collections.sort(listeVille, new ComparatorHabitant());
		for(Ville villeTri : listeVille) {
			System.out.println(villeTri);
		}
		
		System.out.println("-------------------------------------------");
		
		
		Collections.sort(listeVille, new ComparatorNom());
		for(Ville villeTri : listeVille) {
			System.out.println(villeTri);
		}
	}

}
