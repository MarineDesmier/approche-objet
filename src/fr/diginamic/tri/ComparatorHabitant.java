package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville>{

	@Override
	public int compare(Ville v1, Ville v2) {
		if(v1.getNbHabitant() > v2.getNbHabitant()) {
			return 1;
		}
		if(v1.getNbHabitant() < v2.getNbHabitant()) {
			return -1;
		}
		return 0;
	}

	
}
