package TestingPackage;

import java.util.Scanner;

public class TestingRandom14 {
	public static void main(String[] args) {

		// Ako stavi� input.equals(); onda mo�e� provu�i if naredbu, ali samo ako bude
		// ista on �e je ozna�iti kao jednaku

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter a string");
		String input = reader.nextLine();

		if (input.equals("a string")) {
			System.out.println("Great! You read the instructions correctly.");
		} else {
			System.out.println("Missed the mark!");
		}
	}

}
