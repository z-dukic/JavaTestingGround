package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom18 {

	public static void main(String[] args) {
		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi jedan broj"));
		
		if (x>1 || x<5) {
			System.out.println("X je veæi od 1 i manji od 5");
		}else if (x>5) {
			System.out.println("X nije u skupu brojeva na pravcu");
			
		} else {
			System.out.println("Nije u skupu prirodnih brojeva");
		}

		
		
	}	

}
