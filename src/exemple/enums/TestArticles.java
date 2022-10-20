package exemple.enums;

public class TestArticles {

	public static void main(String[] args) {
	
		Article a1 = new Article(TypeArticle.JEU, 127, "Monopoly");
		Article a2 = new Article(TypeArticle.LIVRE, 12, "Hunger Games");
		
		TypeArticle[] types = TypeArticle.values();
		for(TypeArticle type : types) {
			System.out.println(type);
		}

		String nom = "JEU"; // comment je retrouve l'instance de TypeArticle qui s'appelle Jeu ??
		TypeArticle selection = TypeArticle.valueOf(nom);
		System.out.println(selection);
	}

}
