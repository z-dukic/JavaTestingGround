package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom66 {

	public static void main(String[] args) {
		// Kreirajte metodu aritmetièkas sredina tipa float
		// metoda prima niz cijelih brojeva
		// metoda vraæa aritmetièku sredinu svih primljenih brojeva

		// Preko main metode
		TestingRandom66 m = new TestingRandom66();
		m.pero();

	}

	public static void pero() {
		// Bez main metode
		int[] niz = { 10,32,25 };
		
		int zbroj = 0;

		for (int i = 0; i < niz.length; i++) {
			zbroj += niz[i];	
		}
		System.out.println((float) zbroj / niz.length);

	}


}
