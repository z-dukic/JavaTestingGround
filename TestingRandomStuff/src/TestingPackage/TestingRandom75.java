package TestingPackage;

import java.util.Arrays;

public class TestingRandom75 {

	public static void main(String[] args) {

		// Kreirajte metodu slucajniBrojevi
		// tipa niz decimalnih brojeva (double)
		// koja vraæa 10 sluèajnih brojeva
		// Math.random();
		
		
		System.out.println(Arrays.toString(slucajniBrojevi())); // step2: pokreneš slucajniBrojevi

	}

	public static double[] slucajniBrojevi() {
		double[] niz = new double[10]; // iniciraš novi double niz

		for (int i = 0; i < 10; i++) { // for loop vrti 10 puta
			niz[i] = Math.random(); // niz[i] prima random decimalne brojeve
		}
		return niz; // returanš niz od 10 brojeva nakon metode

	}

}
