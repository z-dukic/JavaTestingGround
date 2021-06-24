package TestingPackage;

import java.util.Arrays;

public class TestingRandom61 {

	// Kreirajte metodu slucajniBrojevi
	// tipa niz decimalnih brojeva (double)
	// koja vraća 10 slučajnih brojeva
	// Math.random();

	public static void main(String[] args) {

		System.out.println(Arrays.toString(slucajniBrojevi()));

	}

	public static double[] slucajniBrojevi() {
		double[] niz;

		niz = new double[10];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = Math.random();
		}

		return niz;
	}

}
