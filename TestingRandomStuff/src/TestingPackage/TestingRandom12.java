package TestingPackage;

import java.util.Scanner;

public class TestingRandom12 {

	public static void main(String[] args) {

		int number = 55;
		if (number != 0) {
			System.out.println("Nije nula!");
		}
		if (number >= 155) {
			System.out.println("Nije veæi ili jednak 155");
		}

		Scanner scanner = new Scanner(System.in);
		int broj = Integer.valueOf(scanner.nextLine());

		if (broj >= 5) {
			System.out.println("Broj je veci ili jednak 5!");

		}
		if (broj < 5) {
			System.out.println("Broj je veci od 5!");

		}

		int a = 4;

		if (a > 5) {
			System.out.println("Broj je veci od 5");
		} else {
			System.out.println("Broj je manji ili jednak");

		}

		// Cak i da je neka druga linija koda tocna ispod broja 5 on ju nece isprintati
		// cim ispuni prvi condition
		int b = 5;
		if (b == 1) {
			System.out.println("Broj je jedan");
		} else if (b == 2) {
			System.out.println("Broj je dva");
		} else if (b == 3) {
			System.out.println("Broj je tri");
		} else if (b == 4) {
			System.out.println("Broj je cetiri");
		} else if (b == 5) {
			System.out.println("Broj je pet");
		} else {
			System.out.println("Nije nijedan od navedenih brojeva");
		}

	}

}
