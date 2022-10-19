package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		System.out.println(date);
		
		Date date2 = new Date(122, 9, 19);
		System.out.println(date2);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date3 = "19/05/2016 23:59:30";
		Date date5 = format.parse(date3);
		System.out.println(date3);
		
		// Créez une instance de Date contenant la date/heure système et affichez-la au même format que ci-dessus
		SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateSys = formater.format(date);
		System.out.println(dateSys);
	}

}
