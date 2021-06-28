package TestingPackage;

import java.util.Arrays;

public class TestingRandom79 {

	public static void main(String[] args) {
		// Program uèitava 5 decimalnih brojeva u niz
		// Program ispisuje prvi i posljednji element niza

		float[] niz = new float[5];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = (float) Math.random();
			// niz[i] = i; - ako hoćeš brojeve od 0 do 4.
			System.out.println(niz[i]);
		}

		System.out.println(niz[0] + " i " + niz[4]); //print prvi i zadnji array
		System.out.println(niz[0] + " i " + niz[niz.length - 1]); //verzija #2

	}

}
