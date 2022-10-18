package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

	}
}
