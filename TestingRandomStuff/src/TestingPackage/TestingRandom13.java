package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom13 {

	public static void main(String[] args) {
		// Zadatak 1
		// korisnik unosi cijeli broj
		// za parni broj se ispisuje Osijek
		// za neparni broj se ispisuje Donji Miholjac

		// dodatno zadatak 1
		// U slu�aju unosa parnog broja tra�iti unos
		// dva cijela broja i ispisati zbroj
		// u slu�aju unosa neparnog broja tra�iti unos
		// decimalnog broja i ispisati samo cijeli dio

		int a;
		int b;
		int c;
		double d;
		a = Integer.parseInt(JOptionPane.showInputDialog("Upi�i jedan broj: "));
		if (a % 2 == 0) {
			System.out.println("Broj je paran");
			b = Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj: "));
			c = Integer.parseInt(JOptionPane.showInputDialog("Upi�i treci broj: "));
			System.out.println(b + c);

		} else {
			System.out.println("Broj je neparan: ");
			d = Double.parseDouble(JOptionPane.showInputDialog("Daj mi jedan decimalni broj: "));
			int f = (int) d;
			System.out.println(f);

		}

		// Zadatak 2
		// Program unosi dva cijela broja od korisnika
		// program ispisuje ve�i uneseni broj

		int g;
		int h;

		g = Integer.parseInt(JOptionPane.showInputDialog("Daj mi prvi broj: "));
		h = Integer.parseInt(JOptionPane.showInputDialog("Daj mi drugi broj"));
		if (g > h) {
			System.out.println("g je ve�i od h");
		} else {
			System.out.println("h je ve�i od g");
		}

		// jedno od rje�enja
		/*
		 * public static void main(String[] args) { if(Integer.parseInt(
		 * JOptionPane.showInputDialog("Prvi broj"))>
		 * Integer.parseInt(JOptionPane.showInputDialog("Drugi broj"))) {
		 * System.out.println("Prvi je ve�i"); }else {
		 * System.out.println("Drugi je ve�i"); } }
		 */

		// Zadatak 3
		// Program unosi tri cijela broja od korisnika
		// program ispisuje najmanji uneseni broj

		int i;
		int j;
		int k;

		i = Integer.parseInt(JOptionPane.showInputDialog("Daj mi prvi broj: "));
		j = Integer.parseInt(JOptionPane.showInputDialog("Daj mi drugi broj: "));
		k = Integer.parseInt(JOptionPane.showInputDialog("Daj mi tre�i broj: "));

		if (i < j && i < k) {
			System.out.println(i + " je najmanji");
		} else if (j < i && j < k) {
			System.out.println(j + " je najmanji");
		} else {
			System.out.println(k + " je najmanji");
		}

		// Zadatak 4 - primitivni kalkulator
		// Korisnika unosi prvo operaciju:
		// 1 - zbrajanje
		// 2 - oduzimanje
		// 3 - mno�enje
		// 4 - djeljenje
		// za sve ostale unose program ispisuje: GRE�KA i zavr�ava se
		// Korisnik unosi dva decimalna broja
		// U odnosu na odabranu operaciju program ispisuje rezultat
		// Ako je rezultat cijeli broj tada se ispisuje bez .0

		int x;
		int y;
		int operacije;

		x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi jedan broj: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Daj mi drugi broj: "));
		operacije = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj od 1 do 4: "));

		if (operacije == 1) {
		} else if (operacije == 2) {
		} else if (operacije == 3) {
		} else if (operacije == 4) {
		} else {
			System.out.println("GRE�KA");
		}

		switch (operacije) {
		case 1:
			System.out.println("Zbrajanje:");
			System.out.println(x + y);
			break;

		case 2:
			System.out.println("Oduzimanje: ");
			System.out.println(x - y);
			break;
		case 3:
			System.out.println("Mno�enje: ");
			System.out.println(x * y);
			break;
		case 4:
			System.out.println("Oduzimanje: ");
			System.out.println(x / y);
			break;
		default:
			System.out.println("Ovo je gre�ka");
		}

		//
		// Zadatak 5
		// Program unosi dva cijela broja.
		// U slu�aju da je zbroj unesenih brojeva ve�i od 10
		// i razlika prvog i drugog manja od 0 program ispisuje
		// Osijek, ina�e ispisuje Donji Miholjac.

		int z = 10;
		int t = 15;
		int r = z * t;
		int q = z-t;

		if (r > 10 && q < 0 ) {
			System.out.println("Osijek");
		} else {
			System.out.println("Donji Miholjac");
		}
	}

}
