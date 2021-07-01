package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom98 {

	public static void main(String[] args) {

		int krajReda = Integer.parseInt(JOptionPane.showInputDialog("Broj redova"));
		int krajKolone = Integer.parseInt(JOptionPane.showInputDialog("Broj redova"));

		int pocetakReda = 0, pocetakKolone = 0;

		int niz[][] = new int[krajReda][krajKolone];

		for (int i = pocetakKolone; i < krajKolone; i++) {
			niz[pocetakKolone][i] = 0;

			for (int j = pocetakReda; j < krajReda; j++) {
				niz[pocetakKolone + 1][i] = (i + 1);
				niz[pocetakKolone + 2][i] = (i + 2);
				niz[pocetakKolone + 3][i] = (i + 3);
				niz[pocetakKolone + 4][i] = (i + 4);
				

				niz[i][pocetakReda + 1] = (i + 1);
				niz[i][pocetakReda + 2] = (i + 2);
				niz[i][pocetakReda + 3] = (i + 3);
				niz[i][pocetakReda + 4] = (i + 4);
				

				System.out.print(" " + niz[i][j]);
			}

			System.out.println(" ");

		}
	}

}
