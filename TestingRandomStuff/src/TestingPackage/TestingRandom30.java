package TestingPackage;

import java.util.Scanner;

public class TestingRandom30 {

	public static void main(String[] args) {
		// Write a program that reads values from the user until they input a 0. After
		// this, the program prints the total number of inputted values. The zero that's
		// used to exit the loop should not be included in the total number count.

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Daj mi jedan broj");
			int x = Integer.valueOf(scanner.nextLine());

			if (x == 0) {
				break;

			}
			if (x < 0 && x > 0) {
				continue;
			}
		}
	}

}
