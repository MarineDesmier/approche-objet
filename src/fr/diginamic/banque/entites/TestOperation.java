package fr.diginamic.banque.entites;

import java.text.DecimalFormat;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Operation[] operations = { 
				 new Credit("01/10/2022",1000.0), new Debit("02/10/2022", 150),
				 new Credit("05/10/2022",1500.0), new Debit("02/10/2022", 360.7)
		 };
		
		 for(Operation ope : operations){
				System.out.println(ope+ " "+ope.getType());
		 }
		System.out.println("---------------------------------------------");
		Debit deb1 = new Debit("10/10/2022", 19.8);
		Credit cred2 = new Credit("12/10/2022", 159);
		Debit deb3 = new Debit("10/10/2022", 30);
		Credit cred4 = new Credit("11/10/2022", 75.3);
		
		Operation[] tabOperations = new Operation[4];
		tabOperations[0] = deb1;
		tabOperations[1] = cred2;
		tabOperations[2] = deb3;
		tabOperations[3] = cred4;
		
		double sommeTab = 0;
		
		for(int i = 0; i < tabOperations.length; i++) {
			// WARNING : == pour les types primitifs et méthode equals pour les Object
			if(tabOperations[i].getType().equals("Crédit")) {
				sommeTab += tabOperations[i].getMontant();
			}else {
				sommeTab -= tabOperations[i].getMontant();
			}
			DecimalFormat formatter = new DecimalFormat(".00");
			String soldeFormat = formatter.format(sommeTab);
			
			System.out.println(tabOperations[i]);
			System.out.println("Somme total " +sommeTab+" €");
		}
		
	
		
		
		
			
	}

}
