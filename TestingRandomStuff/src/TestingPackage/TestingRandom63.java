package TestingPackage;

import java.util.Arrays;

public class TestingRandom63 {

	// Kreirajte metodu aritmetièkas sredina tipa float
	// metoda prima niz cijelih brojeva
	// metoda vraæa aritmetièku sredinu svih primljenih brojeva

	public static float[] aretmetickaSredina() {

		float[] pero;
		pero = new float[10];
		pero[1]=10;
		pero[3]=50;
		pero[5]=100;

		float zbroj = 0;
		float sredina = 0;

		for (int i = 0; i < pero.length; i++) {
			zbroj += i;
			sredina = zbroj / pero.length;

		}
		System.out.println(sredina);
		return pero;
	}

	public static void main(String[] args) {
		TestingRandom63 z = new TestingRandom63();
		z.aretmetickaSredina();

	}

}
