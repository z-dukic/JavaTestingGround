package TestingPackage;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestingRandom06 {

	public static void main(String[] args) {
		// Ne mozes pretvoriti int u boolean i sl., ali mozes pretvoriti npr. double u
		// int, float itd.
		
		double prviDouble = 10.56;
		prviDouble = 5;
		
		int prviInt = 10;
		prviDouble = prviInt;

		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("Pero"));
		
		Scanner scanner = new Scanner(System.in);
		String txt = scanner.nextLine();
		
		String vrijednostStringa = "50";
		int vrijednost = Integer.valueOf(vrijednostStringa);
		System.out.println(vrijednost);
		
		int vrijednostJedan = Integer.valueOf(scanner.nextLine());
		System.out.println("Vrijednost tvog broja je: " + vrijednostJedan);
		
		String vrijednostDoublea = "10.57";
		double vrijednostDuplica = Double.valueOf(vrijednostDoublea);
		System.out.println(vrijednostDuplica);
		
	}

}
