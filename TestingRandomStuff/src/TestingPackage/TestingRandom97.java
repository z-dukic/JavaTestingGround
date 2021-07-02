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



				niz[j][krajReda - 1] = i+1;
				niz[j][krajReda - 2] = i+2;
				niz[j][krajReda - 3] = i+3;
				niz[j][krajReda - 4] = i+4;
				niz[j][krajReda - 5] = i+5;
						// prvi stupac

				System.out.print(" " + niz[i][j]);
			}

			System.out.println(" ");

		}
		System.out.println(suma);
	}

}
