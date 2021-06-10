package TestingPackage;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestingRandom29 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Daj mi jedan pozitivni broj. Ako daš nulu prekidam program.");
			int x = Integer.valueOf(scanner.nextLine());

			if (x == 0) {
				break;
			}

			if (x < 0) {
				System.out.println("Broj manji od 0. Daj drugi broj.");
				continue;

			}
			System.out.println(x * x);
		}
	}
}
