package fr.diginamic.operations;

public class CalculMoyenne {

	private double[] tabMoy;

	/**
	 * @param tabMoy (constructeur)
	 */
	public CalculMoyenne(double[] tabMoy) {
		super();
		this.tabMoy = tabMoy;
	}

	public void ajout(double a) {

		double[] newTab = new double[tabMoy.length + 1];
		for (int i = 0; i <= tabMoy.length - 1; i++) {
			newTab[i] = tabMoy[i];
		}
		newTab[newTab.length - 1] = a;
		this.tabMoy = newTab;
	}

	public double calcul() {
		double moyenne = 0;
		for (int i = 0; i <= tabMoy.length - 1; i++) {
			moyenne = tabMoy[i] + moyenne;
		}
		return moyenne / tabMoy.length;
	}
}
