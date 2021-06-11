package TestingPackage;

import java.util.Scanner;

public class TestingRandom33 {

	public static void main(String[] args) {

		// Write a program, which reads an integer from the user. Then the program
		// prints numbers from that number to 100. You can assume that the user always
		// gives a number less than 100. Below are some examples of the expected
		// functionality.
		
		Scanner scanner = new Scanner(System.in);
		
		int x = Integer.valueOf(scanner.nextLine());
		int start = 0;
		int end = 100;
		
		System.out.println("Daj mi jedan broj manji ili jedank 100!");
		
		for (x = start; x<end; x++) {
			System.out.println(x);
		}
		
	}

}


//int start = 3;
//int end = 7;
//for (int i = start; i < end; i++) {
  //  System.out.println(i);