package fr.diginamic.essais;


import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		// Opération d'une addition

		Operations opAdd = new Operations();
		double resultatAdd = opAdd.addition(6, 6);
		System.out.println("Le résultat de l'addition est " + resultatAdd);
		
		// Opération d'une soustration
		
		Operations opSous = new Operations();
		double resultSous = opSous.soustraction(17, 6);
		System.out.println("Le résultat de la soustraction est " + resultSous);
		
		// Opération d'une multiplication
		
		Operations opMulti = new Operations();
		double resultMulti = opMulti.multiplication(8, 14);
		System.out.println("Le résultat de la multiplication est " + resultMulti);
		
		// Opération d'une division
		
		Operations opDivi = new Operations();
		double resultDivi = opDivi.division(31, 3);
		System.out.println("Le résultat de la division est " + resultDivi);
	}

}
