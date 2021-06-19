package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom48 {

	public static void main(String[] args) {
		// Program od korisnika unosi brojeve
		// sve dok korisnik ne unese broj 0
		// Program ispisuje zbroj svih unesenih brojeva

		int x;
		int sum=0;

		for (;;) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Daj jedan broj"));
			if (x == 0) {
				break;
			}
			sum = sum + x;

		}
		System.out.println("Zbroj je: " + sum);

	}

}
