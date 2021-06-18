package TestingPackage;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TestingRandom45 {

	public static void main(String[] args) {

		// Program od korisnika unosi dva parna broja
		// Program ispisuje njohov zbroj

		int x;
		int y;

		for (;;) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi x"));
			y = Integer.parseInt(JOptionPane.showInputDialog("Daj mi y"));
			if (x % 2 == 0 && y % 2 == 0) {
				System.out.println(x + y);
				break;

			}



		}

	}

}
