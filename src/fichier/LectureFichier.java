package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
	public static void main(String[] args)  throws IOException{
		
		Path path = Paths.get("D:\\Documents\\coursWeb\\Diginamic\\CoursJava\\Java-Richard\\tpRecensement\\recensement.csv");
		
//		System.out.println(path.getRoot());
//		System.out.println(path.getParent());
//		System.out.println(path.getFileName());
		
		List<String> afficheTxt = Files.readAllLines(path, StandardCharsets.UTF_8);
		for(String aff : afficheTxt)
		System.out.println(aff);

		// tableau vide
		List<Ville> listeVille = new ArrayList<>();
		
		// boucle pour toute les villes
		for(int i = 1; i < afficheTxt.size(); i++) {
			String[] ville = afficheTxt.get(i).split(";");
			String nom = ville[6];
			int population = Integer.parseInt(ville[9].replaceAll(" ", ""));
			String region = ville[1];
			String departement = ville[0];
			
			// création d'une ville 
			Ville v = new Ville(nom, departement, region, population);
			listeVille.add(v);
			System.out.println(listeVille.get(i-1));
		}
//		
//		// On doit lire le contenu de la liste avant de copier
//		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//		
		// afficher les villes de plus de 25 000 habitants
		List<Ville> villeSup = new ArrayList<>();
			for(int i = 0; i < listeVille.size(); i++) { 
				Ville v = listeVille.get(i);
				if(v.getPopTotal() > 25000) {
					villeSup.add(v);
				}
			}
			
			
		// création de la copie
		Path pathVille = Paths.get("D:\\Documents\\coursWeb\\Diginamic\\CoursJava\\Java-Richard\\tpRecensement\\recensementVilleSup25K.csv");
		
		
		// Créer une liste de string
		List<String> liste = new ArrayList<>();
		liste.add("Nom ville, département, région, nombre total d'habitant");
		for(int i = 0; i < listeVille.size(); i++) {
			Ville v = listeVille.get(i);
			liste.add(v.toString2());
		}
		
		Files.write(pathVille, liste);
	}
}
