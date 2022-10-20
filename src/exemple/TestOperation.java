package exemple;

import static exemple.StringUtils.build;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation ope = new Operation();
		double resultat = ope.addition(14, 69, 7 ,-2, 32, 63);
		
		System.out.println(resultat);
		
		int a = 15;
		String chaine = build("Bonjour", a, new Vehicule("Renault", "Captur"));
		System.out.println(chaine);
	}

}
