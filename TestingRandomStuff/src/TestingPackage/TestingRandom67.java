package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom67 {

	public static void main(String[] args) {
		// Kreirajte metodu primBroj tipa boolean koja za primljeni
		// cijeli broj vraæa true ako je prim ili false ako nije
		// prim broj

		// Kreirajte metodu primBrojevi tipa void koja prima
		// dva cijela broja
		// metoda ispisuje prim brojeve izmeðu dva primljena broja

		TestingRandom67 pero = new TestingRandom67();
	
		System.out.println("Testiram broj: " + x);
		System.out.println(primBroj(5));

	}

	public static boolean primBroj(int x) {

		for (int i = 2; i < x; i++) {
			if (i % x == 0) {

				System.out.println("Broj koji si izabrao je primaran");
				return false;
			}

		}

		return true;

	}

}
