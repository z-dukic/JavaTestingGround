package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom64 {
	// Kreirajte metodu aritmetièkas sredina tipa float
	// metoda prima niz cijelih brojeva
	// metoda vraæa aritmetièku sredinu svih primljenih brojeva
	
	public static float aretmetickaSredina(int[]niz) {
		int zbroj = 0;
		
		for (int i=0; i <niz.length;i++) {
			zbroj+=niz[i];
		}
		return (float) zbroj / niz.length;
		
	}

}

