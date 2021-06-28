package TestingPackage;

import java.util.Arrays;

public class TestingRandom77 {

	public static void main(String[] args) {
		// Kreirajte metodu aritmetièkas sredina tipa float
		// metoda prima niz cijelih brojeva
		// metoda vraæa aritmetièku sredinu svih primljenih brojeva
		
		int[]niz = {3,4,5,9};
		System.out.println(aretmetickaSredina(niz));

	}

	public static float aretmetickaSredina(int[] niz) {

		float suma = 0;

		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}

		return suma / niz.length;

	}

}
