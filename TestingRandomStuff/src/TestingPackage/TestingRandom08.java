package TestingPackage;

import java.util.Scanner;

public class TestingRandom08 {

	public static void main(String[] args) {
		
		//Bez zagrada ponaša se kao dva string
		
		System.out.println("Rezultat je: " + 2 + 2);
		System.out.println("Rezultat je: " + (2 + 2));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Daj mi broj: ");
		int prviBroj = Integer.valueOf(scanner.nextLine());
		System.out.println("Daj mi drugi broj: ");
		int drugiBroj = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Zbrajanje: " + (prviBroj + drugiBroj));
		

	}

}
