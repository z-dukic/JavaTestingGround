package TestingPackage;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class testingRandom36 {

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

		int a = Integer.parseInt(JOptionPane.showInputDialog("Daj mi A"));

		if (a % 2 == 0) {
			System.out.println("Osijek");
			int b = Integer.parseInt(JOptionPane.showInputDialog("Daj mi B"));
			int c = Integer.parseInt(JOptionPane.showInputDialog("Daj mi C"));
			System.out.println("Zbroj B i C je: " + b + c);

		} else {
			System.out.println("Donji Miholjac");
			double d = Double.parseDouble(JOptionPane.showInputDialog("Daj mi D"));
			System.out.println((int)d);
			
		}
		
		// Zadatak 2
		// Program unosi dva cijela broja od korisnika
		// program ispisuje ve�i uneseni broj
		
		int e = Integer.parseInt(JOptionPane.showInputDialog("Daj mi E"));
		int f = Integer.parseInt(JOptionPane.showInputDialog("Daj mi F"));
		
		if (e>f) {
			System.out.println(e);
		}else if (e<f) {
			System.out.println(f);
		}else {
			System.out.println("Brojevi su jednake veličine");
		}
		
		// Zadatak 3
		// Program unosi tri cijela broja od korisnika
		// program ispisuje najmanji uneseni broj
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi X"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Daj mi Y"));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Daj mi Z"));
		
		if (x<y && x<z) {
			System.out.println("X je najmanji");
		} else if (y<x && y<z) {
			System.out.println("Y je najmanji");
		} else if (z<y && z<x) {
			System.out.println("Z je najmanji");
		}else if (z==y || x==y) {
			System.out.println("Dva broja ili više brojeva su jednaki");
		}else {
			System.out.println("Greška");
			
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
		

		
		
		
	}

}
