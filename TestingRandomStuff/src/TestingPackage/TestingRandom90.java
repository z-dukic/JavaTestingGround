package TestingPackage;

public class TestingRandom90 {

	public static void main(String[] args) {
		// Kreirajte metodu aritmetièkas sredina tipa float
		// metoda prima niz cijelih brojeva
		// metoda vraæa aritmetièku sredinu svih primljenih brojeva

		int[] niz = { 10, 10, 10, 10 };
		System.out.println(aretmetickaSredina(niz));

	}

	public static float aretmetickaSredina(int[] niz) {

		float zbroj = 0;

		for (int i = 0; i < niz.length; i++) {
			zbroj += niz[i];

		}
		return zbroj / niz.length;
	}

}


