package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom95 {
	public static void main(String[] args) {

		int krajReda = Integer.parseInt(JOptionPane.showInputDialog("Broj redova"));
		int krajKolone = Integer.parseInt(JOptionPane.showInputDialog("Broj redova"));

		int pocetakReda = 0, pocetakKolone = 0;

		int broj = 1;
		int sum = 0;

		int niz[][] = new int[krajReda][krajKolone];

	
			for (int i = pocetakKolone; i < krajKolone; i++) {
				niz[pocetakReda][i] = (i+1);
				
				

				for (int j = pocetakReda; j < krajReda; j++) {
					niz[i][krajReda - 1] = (i+1);
				
					
				

					System.out.print(" " + niz[i][j]);
				}

				System.out.println(" ");

			}
	
			}

	}


