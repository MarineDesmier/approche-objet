package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// Créer une instance de Date à la date du 19 mai 2016 à 23h59 et 30 secondes et affichez-la au format suivant : jour/mois/année
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		System.out.println(date);
		
		SimpleDateFormat formater = new SimpleDateFormat("'Le' dd MMMM yyyy ");
		String dateFormate = formater.format(date);
		System.out.println(dateFormate);
		
		// Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du jour
		Calendar cal2 = Calendar.getInstance();
		Date dateJour = cal2.getTime();
		System.out.println(dateJour);
		
		// Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
		SimpleDateFormat formater2 = new SimpleDateFormat("'Le' dd MMMM yyyy 'à' HH:mm:ss");
		String dateFormate2 = formater2.format(dateJour);
		System.out.println(dateFormate2);
		
		// Affichez la même instance avec le nom des jours et des mois en français, russe, chinois et allemand
		
		SimpleDateFormat formateRu = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		String dateFormateRu = formateRu.format(dateJour);
		System.out.println(dateFormateRu);
		
		SimpleDateFormat formateChi = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", new Locale("zh", "ZH"));
		String dateFormateChi = formateChi.format(dateJour);
		System.out.println(dateFormateChi);
		
		SimpleDateFormat formateAll = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", new Locale("de", "DE"));
		String dateFormateAll = formateAll.format(dateJour);
		System.out.println(dateFormateAll);
		
	}

}
