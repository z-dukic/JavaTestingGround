package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom95 {
	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Broj redova"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Broj redova"));

		int niz[][] = new int[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++)

				System.out.print(" " + niz[i][j]);

			System.out.println(" ");
		}

	}

}
