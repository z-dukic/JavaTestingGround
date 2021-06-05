package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom02 {

	public static void main(String[] args) {

		// deklarirajte varijablu za pohranu tjelesne
		// temperature èovjeka kao int i dodjelite
		// vrijednost 36
		int tjelesnaTemperatura = 36;

		// deklarirajte varijablu za temperaturu
		// mjesta kao int i dodjelite
		// vrijednost -9. Ispišite deklariranu vrijednost

		int temperaturaMjesta = -36;

		// Korisnik uèitava dva cijela broja
		// program ispisuje njivog zbroj

		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj 'a' "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj 'b' "));
		System.out.println(a + b);

		// Program od korisnika uèitava tri broja
		// program ispisuje zbroj prvog i treæeg
		// podjeljen s drugim unesenim brojem

		int d = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj 'd'"));
		int e = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj 'e' "));
		int f = Integer.parseInt(JOptionPane.showInputDialog("Upiši treæi broj 'f' "));

		System.out.println((d + e) / f);

		// Korisnik unosi dvoznamenkasti broj
		// Program ispisuje prvu znamenku

		int g = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 'g' "));
		System.out.println(g / 10);
	}

}
