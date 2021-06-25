package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom65 {

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Broj stupaca"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Broj redova"));
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;

		int stupacX = x;
		int redY = y;

		int[][] array = new int[x][y];
		for (int i = 0; i < stupacX; i++) {
			for (int j = 1; j < redY; j++) {
				sum = (sum + 1);
				sum1 = x * y;
				sum2 = sum1 - sum;
				

				array[i][j] = sum2;
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}

	}

}
