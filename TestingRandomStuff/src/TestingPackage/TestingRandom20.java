package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom20 {

	public static void main(String[] args) {
		// Zadatak 1
		// korisnik unosi cijeli broj
		// za parni broj se ispisuje Osijek
		// za neparni broj se ispisuje Donji Miholjac

		// dodatno zadatak 1
		// U sluèaju unosa parnog broja tražiti unos
		// dva cijela broja i ispisati zbroj

		// u sluèaju unosa neparnog broja tražiti unos
		// decimalnog broja i ispisati samo cijeli dio

		int x, y, z;
		x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi X"));

		if (x % 2 == 0) {
			System.out.println("Osijek");
			y = Integer.parseInt(JOptionPane.showInputDialog("Daj mi Y"));
			z = Integer.parseInt(JOptionPane.showInputDialog("Daj mi Z"));
			System.out.println("Zbroj je: " + (y + z));

		} else {
			System.out.println("Donji Miholjac");
		}

		// Zadatak 2
		// Program unosi dva cijela broja od korisnika
		// program ispisuje veæi uneseni broj

		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Daj mi A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Daj mi B"));

		if (a > b) {
			System.out.println("A je veæi od B");
		} else {
			System.out.println("B je veæi od A");
		}

		// jedno od rješenja
		/*
		 * public static void main(String[] args) { if(Integer.parseInt(
		 * JOptionPane.showInputDialog("Prvi broj"))>
		 * Integer.parseInt(JOptionPane.showInputDialog("Drugi broj"))) {
		 * System.out.println("Prvi je veæi"); }else {
		 * System.out.println("Drugi je veæi"); } }
		 */

		// Zadatak 3
		// Program unosi tri cijela broja od korisnika
		// program ispisuje najmanji uneseni broj

		int d, e, f;

		d = Integer.parseInt(JOptionPane.showInputDialog("Daj mi D"));
		e = Integer.parseInt(JOptionPane.showInputDialog("Daj mi E"));
		f = Integer.parseInt(JOptionPane.showInputDialog("Daj mi F"));

		if (d < e && d < f) {
			System.out.println(d + "je najmanji broj");
		} else if (e < d && e < f) {
			System.out.println(e + "je najmanji broj");
		} else {
			System.out.println(f + "je najmanji broj");
		}

		// Zadatak 4 - primitivni kalkulator
		// Korisnika unosi prvo operaciju:
		// 1 - zbrajanje
		// 2 - oduzimanje
		// 3 - množenje
		// 4 - djeljenje
		// za sve ostale unose program ispisuje: GREŠKA i završava se
		// Korisnik unosi dva decimalna broja
		// U odnosu na odabranu operaciju program ispisuje rezultat
		// Ako je rezultat cijeli broj tada se ispisuje bez .0

		int operacije;
		double i, j;

		operacije = Integer.parseInt(JOptionPane
				.showInputDialog("Izaberi operaciju: 1 - zbrajanje, 2 - oduzimanje, 3 - mnozenje, 4 - djeljenje"));
		i = Double.parseDouble(JOptionPane.showInputDialog("Daj mi I"));
		j = Double.parseDouble(JOptionPane.showInputDialog("Daj mi J"));

		double p = i + j;
		double r = i - j;
		double k = i * j;
		double m = i / j;

		if (operacije == 1) {

		} else if (operacije == 2) {

		} else if (operacije == 3) {

		} else if (operacije == 4) {

		} else {
			System.out.println("GREŠKA");
		}

		switch (operacije) {
		case 1:
			System.out.println("Zbrajanje");
			if (p % 1 == 0) {
				System.out.println((int) p);
			} else {
				System.out.println(p);
			}

			break;
		case 2:
			System.out.println("Oduzimanje");
			if (r % 1 == 0) {
				System.out.println((int) r);
			} else {
				System.out.println(r);
			}

			break;
		case 3:
			System.out.println("Množenje");
			if (k % 1 == 0) {
				System.out.println((int) k);
			} else {
				System.out.println(k);
			}
			break;
		case 4:
			System.out.println("Djeljenje");
			if (m % 1 == 0) {
				System.out.println((int) m);
			} else {
				System.out.println(m);
			}
			break;
		default:
			System.out.println("Greška");
		}

		//
		// Zadatak 5
		// Program unosi dva cijela broja.
		// U sluèaju da je zbroj unesenih brojeva veæi od 10
		// i razlika prvog i drugog manja od 0 program ispisuje
		// Osijek, inaèe ispisuje Donji Miholjac.

		
		int c,v;
				
		c = Integer.parseInt(JOptionPane.showInputDialog("Daj mi C"));
		v = Integer.parseInt(JOptionPane.showInputDialog("Daj mi V"));
		
		if((c+v)>10 && (c-v)<0) {
			System.out.println("OSijek");
		}else {
			System.out.println("Donji Miholjac");
		}
		
		
		
		
		
		
		
		
		
	}

}
