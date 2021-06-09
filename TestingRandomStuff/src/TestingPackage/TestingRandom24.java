package TestingPackage;

import java.util.Scanner;

public class TestingRandom24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = 0;
		int y = 0;

		while (true) {
			System.out.println("Daj mi jedan broj");
			int z = Integer.valueOf(scanner.nextLine());
			if (z == 0) {
				break;
			}
			if (z > 0) {
				x = x + 1;
			}
			if (z < 0) {
				y = y + 1;
			}

			System.out.println("X broj prikazan " + x + " puta");
			System.out.println("Y broj prikazan " + y + " puta");

		}
		if (x > y) {
			System.out.println("Postotak pozitivnih brojeva " + ((double) (x+y)/x) * 100);
		} else {
			System.out.println("Postotak negativnih brojeva je " + ((double) (x+y)/y) * 100);
		}

	}

}
