package exemple;

public class TestVehicule {

	public static void main(String[] args) {
		
		Avion avion = new Avion();
		
		avion.setModele("A320");
		avion.setMarque("Airbus");
		avion.setMatricule("FR666");

		avion.demarrer();
		System.out.println(avion);
	}

}
