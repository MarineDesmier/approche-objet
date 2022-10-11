package exemple;

public class TestFacture {

	public static void main(String[] args) {
		Facture f = new Facture(100);
		System.out.println(f.getConsommationKwh()+" "+f.getMontant());

		f.modifierConsommation(150.0);
		System.out.println(f.getConsommationKwh()+" "+f.getMontant());
	}

}
