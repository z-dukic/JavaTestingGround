package TestingPackage;

import java.util.Scanner;

public class TestingRandom07 {

	public static void main(String[] args) {
		
		//Sve osim ako napi�e� true izbacit �e false. Bilo koji broj, rije� itd.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Napi�i jedan boolean");
		boolean value = Boolean.valueOf(scanner.nextLine());
		System.out.println("Napisao si: " + value);

	}

}
