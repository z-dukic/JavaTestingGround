package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom17 {

	public static void main(String[] args) {

		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Unesi jedan broj"));

		if (x < 0) {

		} else if (x > 0 && x < 10) {

		} else {
			System.out.println("Nešto mora pisati");
		}

		switch (x) {
		case 1:
			System.out.println("Broj je manji od nula");
			break;

		case 2:
			System.out.println("Broj je izmeðu 1 i 10");
			break;

		case 3:
			System.out.println("Broj je veæi od 10");
		default:
			System.out.println("Sjebo si program");
		}
	}

}
