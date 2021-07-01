package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom97 {
	public static void main(String[] args) {
		int krajReda = Integer.parseInt(JOptionPane.showInputDialog("Broj redova"));
		int krajKolone = Integer.parseInt(JOptionPane.showInputDialog("Broj redova"));

		int pocetakReda = 0, pocetakKolone = 0;

		int suma = 0;
		int suma2 = 0;

		int niz[][] = new int[krajReda][krajKolone];

		for (int i = pocetakKolone; i < krajKolone; i++) {
			niz[pocetakKolone][i] = 0;

			for (int j = pocetakReda; j < krajReda; j++) {

				suma = krajKolone * krajReda;
				niz[krajKolone - 1][i] = i+1;
				niz[krajKolone - 2][i] = i+1;
				niz[krajKolone - 3][i] = i+1;
				niz[krajKolone - 4][i] = i+1;
				niz[krajKolone - 5][i] = i+1;

				niz[j][krajReda - 1] = j+1;
				niz[j][krajReda - 2] = 1+(niz[j][krajReda - 1]);
				niz[j][krajReda - 3] = j+3;
				niz[j][krajReda - 4] = j+4;
				niz[j][krajReda - 5] = j+5;
						// prvi stupac

				System.out.print(" " + niz[i][j]);
			}

			System.out.println(" ");

		}
		System.out.println(suma);
	}

}
