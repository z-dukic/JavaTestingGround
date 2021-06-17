package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom43 {

	public static void main(String[] args) {
		//Program unosi 2 broja i ispisuje zbroj
		int a=5;
		int b=6;
		
		System.out.println(a + " "+ b);
		
		// program od korisnika unosi 2 decimalna broja
		// ispisuje veæi
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Daj mi y"));
		
		if (x>y) {
			System.out.println("X je veći");
		}else if (x<y) {
			System.out.println("Y je veći");
			
		}else {
			System.out.println("Brojevi su isti");
		}
		

		
		

	}

}
