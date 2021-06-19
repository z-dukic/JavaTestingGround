package TestingPackage;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TestingRandom52 {

	public static void main(String[] args) {
		// sve što smo radili dosad

		int[] numbers = new int[10];
		numbers[0] = 5;
		numbers[2] = 10;
		numbers[5] = 20;

		System.out.println(Arrays.toString(numbers));

		char[] slova = new char[5];
		slova[1] = 'a';
		slova[2] = 'p';

		System.out.println(Arrays.toString(slova));

		int[] pero = { 10, 5, 15, 10, 2 };
		System.out.println(Arrays.toString(pero));
		System.out.println(pero[1]);

		int[] niz = new int[5];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Daj jedan broj"));
		}
		System.out.println(Arrays.toString(niz));

		int[][] tablica = new int[3][3];
		tablica[1][2] = 1;
		System.out.println(Arrays.deepToString(tablica));

		int[][] tablica2 = { { 5, 6, 3 }, { 2, 3, 4 } };
		System.out.println(Arrays.deepToString(tablica2));

		int[] manutd = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < manutd.length; i++) {
			System.out.println(manutd[i]);
			
			
		}
	}

}
