package TestingPackage;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TestingRandom54 {
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Koliko će članova arraya"));
		int i = Integer.parseInt(JOptionPane.showInputDialog("Koliko će biti stupaca"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Daj mi redova"));

		int[] niz = new int[x];
		
		for (i = 0; i < niz.length; i++) {
			for(j = 0; j < niz.length; j++) {
				System.out.println("Daj mi jedan broj za matricu");
				int z= Integer.parseInt(JOptionPane.showInputDialog("Daj mi jedna broj"));
				System.out.println(z+ "");
				
			}
			System.out.println();
			
			
		}
		System.out.println(Arrays.toString(niz));

	}
}


//ne radi dobro