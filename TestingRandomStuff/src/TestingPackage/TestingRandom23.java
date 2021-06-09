package TestingPackage;

import java.util.Scanner;

public class TestingRandom23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int pozitivniBrojevi = 0;
		int negativniBrojevi = 0;

		while (true) {
			System.out.println("Daj mi jedan broj, nula da prestane");
			int broj = Integer.valueOf(scanner.nextLine());

			if (broj == 0) {
			break;

		}

		if (broj > 0) {
			pozitivniBrojevi = pozitivniBrojevi + 1;
		}

		if (broj < 0) {
			negativniBrojevi = negativniBrojevi + 1;
		}
		System.out.println("Pozitivni brojevi: " + pozitivniBrojevi);
		System.out.println("Negativni brojevi: " + negativniBrojevi);
	}

}
}
