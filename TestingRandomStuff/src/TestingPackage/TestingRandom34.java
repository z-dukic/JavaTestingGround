package TestingPackage;

import java.util.Scanner;

public class TestingRandom34 {

	public static void main(String[] args) {
		// Part1: Write a program which prints the integers from 1 to a number given by
		// the
		// user.

		// Part 2: Ask the user for the starting point as well.
		System.out.println("Daj mi jedan broj i ispisat æu sve brojeve od 1 do tog broja");
		Scanner scanner = new Scanner(System.in);
		int y = Integer.valueOf(scanner.nextLine());
		System.out.println("Daj mi poèetni broj");
		int z = Integer.valueOf(scanner.nextLine());
		

		int x;

		for (x = z; x < y; x++) {
			System.out.println(x);
		}
	}

}
