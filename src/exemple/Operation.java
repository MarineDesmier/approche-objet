package exemple;

public class Operation {

	public double addition(double... items) {
		// items est un tableau de double
		double somme = 0.0;
		for(int i = 0; i < items.length; i++) {
			somme += items[i];
		}
		return somme;
	}
}
