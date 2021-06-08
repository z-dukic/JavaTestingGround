package TestingPackage;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestingRandom19 {

	public static void main(String[] args) {
		
		int x;
		
		
		while (true) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi jedna pozitivan broj!"));
			
			if (x == 0) {
				System.out.println("Prekinut program!");
				break;
			}
			
			if(x < 0) {
				System.out.println("Tvoj broj je negativan!");
				continue;
			}
			
			else {
				System.out.println("Tvoj broj je: " + x);
			}
			
			
			
		}
	}

}
