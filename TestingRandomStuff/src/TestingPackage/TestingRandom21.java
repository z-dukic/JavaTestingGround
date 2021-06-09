package TestingPackage;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestingRandom21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Daj mi jedan broj, upiši nula za prekid programa");
			int x = Integer.valueOf(scanner.nextLine());
			if (x ==0){
				break;
			}System.out.println("Tvoj broj je: " + x);
			
		}System.out.println("To je to. Hvala na sudjelovanju");
	}
	
	
	

}
