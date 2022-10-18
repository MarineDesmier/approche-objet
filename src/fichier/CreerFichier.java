package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		try {
//			File newFichier = new File("D:\\Documents\\coursWeb\\Diginamic\\CoursJava\\Java-Richard\\tpRecensement\\copie.csv");
//			if(newFichier.createNewFile()) {
//				System.out.println("Fichier crée");
//			}else {
//				System.out.println("Fichier déjà existant");
//			}
//		} catch (Exception e) {
//			System.err.println(e);
//		}
		
		Path path = Paths.get("D:\\Documents\\coursWeb\\Diginamic\\CoursJava\\Java-Richard\\tpRecensement\\recensement.csv");
		
		// On doit lire le contenu de la liste avant de copier
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		// Boucle sur les 100 1ere lignes
		List<String> newFichier = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			newFichier.add(lines.get(i));
		}
		
		// création de la copie
		Path pathCopie = Paths.get("D:\\Documents\\coursWeb\\Diginamic\\CoursJava\\Java-Richard\\tpRecensement\\recensementCopie.csv");
		Files.write(pathCopie, newFichier);
		
		// lecture
		List<String> lines2 = Files.readAllLines(path, StandardCharsets.UTF_8);
		for(String copie : lines2) {
			System.out.println(copie);
			
		}
	}

}
