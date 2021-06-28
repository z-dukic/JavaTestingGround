package TestingPackage;

import java.util.Arrays;

public class TestingRandom85 {

	public static void main(String[] args) {
		// Kreirajte metodu slucajniBrojevi
		// tipa niz decimalnih brojeva (double)
		// koja vraæa 10 sluèajnih brojeva
		// Math.random();

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
