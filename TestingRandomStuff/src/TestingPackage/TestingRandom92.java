package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom92 {

	public static void main(String[] args) {
		// Kreirajte metodu primBrojevi tipa void koja prima
		// dva cijela broja
		// metoda ispisuje prim brojeve izmeðu dva primljena broja
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Daj x")); // Korisnik unosi broj
		int y = Integer.parseInt(JOptionPane.showInputDialog("Daj y")); // Korisnik unosi drugi broj
				
		primBrojevi(x, y); // Printanje rezultat
		
	}

	public static void primBrojevi(int x, int y) { // pocetni broj, zavrsni broj
		boolean flag; // flag ako je false

		for (int i = x; i < y; i++) { 
			flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(i);
			}

		}
	}

}
