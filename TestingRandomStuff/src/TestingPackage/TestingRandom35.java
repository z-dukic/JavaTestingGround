package TestingPackage;

import java.util.Scanner;

public class TestingRandom35 {

	public static void main(String[] args) {
		// Implement a program, which calculates the sum 1+2+3+...+n where n is given as
		// user input.
		Scanner scanner = new Scanner(System.in);
		int x = Integer.valueOf(scanner.nextLine());
		int y;
		int sum = 0;

		for (y = 1; y <= x; y++) {
			sum += y;

		}
		System.out.println(sum);
	}

}
