package TestingPackage;

import java.util.Scanner;

public class TestingRandom15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dodaj dva stringa: ");
		String prviString = scanner.nextLine();
		String drugiString = scanner.nextLine();

		if (prviString.equals(drugiString)) {
			System.out.println("Ova dva broja su ista");
		} else {
			System.out.println("Ova dva stringa nisu ista");
		}
		if (prviString.equals("dva stringa")) {
			System.out.println("Jako pametno!");
		}
		if (drugiString.equals("dva stringa")) {
			System.out.println("Jako pametno vol2");
		}

	}
}
