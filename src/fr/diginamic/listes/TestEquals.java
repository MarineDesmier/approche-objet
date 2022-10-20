package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {
		
		VilleList v1 = new VilleList("Lyon", 694000, Continent.EUROPE);
		VilleList v2 = new VilleList("Lyon", 694000, Continent.EUROPE);
		
		boolean result = v1.equals(v2);
		
		System.out.println(result);

		VilleList v3 = new VilleList("Lyon", 690041, Continent.EUROPE);
		VilleList v4 = new VilleList("Lyon", 690046, Continent.EUROPE);
		
		boolean result2 = v3.equals(v4);
		
		System.out.println(result2);
		System.out.println("---------------------");

		//test == false
		
		boolean result3 = false;
		if(v3 == v4) {
			result3 = true;
		}
		
		System.out.println(result3);
		
		boolean result4 = false;
		if(v1.getNbHabitant() == v2.getNbHabitant()) {
			result4 = true;
		}
		
		System.out.println(result4);
	}

}
