package TestingPackage;

import java.util.Scanner;

public class TestingRandom31 {

	public static void main(String[] args) {

		// Write a program that reads values from the user until they input a 0. After
		// this, the program prints the total number of inputted values that are
		// negative. The zero that's used to exit the loop should not be included in the
		// total number count.

		Scanner scanner = new Scanner(System.in);

		int y = 0;
		while (true) {
			System.out.println("Daj mi jedan broj. Ako staviš nulu zaustavljam program");
			int x = Integer.valueOf(scanner.nextLine());

			if (x == 0) {
				System.out.println("Broj negativnih brojeva je: " + y);
				break;

			}
			if (x > 0) {

				continue;

			}
			if (x < 0) {

				y = y + 1;
				

				continue;
				

			}
			
		}

	}

}
