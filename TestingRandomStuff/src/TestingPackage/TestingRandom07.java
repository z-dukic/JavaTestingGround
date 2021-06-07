package TestingPackage;

import java.util.Scanner;

public class TestingRandom07 {

	public static void main(String[] args) {
		
		//Sve osim ako napišeš true izbacit æe false. Bilo koji broj, rijeè itd.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Napiši jedan boolean");
		boolean value = Boolean.valueOf(scanner.nextLine());
		System.out.println("Napisao si: " + value);

	}

}
