package TestingPackage;

import java.util.Scanner;

public class TestingRandom32 {

	public static void main(String[] args) {
		// Write a program that reads an integer from the user. Next, the program prints
		// numbers from 0 to the number given by the user. You can assume that the user
		// always gives a positive number. 
		
		Scanner scanner = new Scanner(System.in);
		
		int x = Integer.valueOf(scanner.nextLine());
		int y = 0;
		while (y<x) {
			System.out.println(y);
			y++;
		}
			
		

	}

}
