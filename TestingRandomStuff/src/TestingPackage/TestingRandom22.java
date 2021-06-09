package TestingPackage;

import java.util.Scanner;

public class TestingRandom22 {

	public static void main(String[] args) {

		// Program bilježi koliko puta je upisan broj 1 od strane usera
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		while (true) {

			System.out.println("Daj mi broj jedan! (0 za izaæi iz programa): ");
			int b = Integer.valueOf(scanner.nextLine());

			if (b == 0) {
				break;
			}
			if (b == 1) {
				a = a + 1;
				
			}
			System.out.println("Ukupan broj je: " + a);
		}
		// a je jednako 1; 
	}

}
