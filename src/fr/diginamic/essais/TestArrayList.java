package fr.diginamic.essais;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> liste =  new ArrayList<String>();
		liste.add("Arras");
		liste.add("Lyon");
		liste.add("Lille");
		liste.add("Nantes");
		liste.add("Paris");
		liste.add("Mâcon");
		
		Collections.sort(liste);
		
		System.out.println(liste);
	}

}
