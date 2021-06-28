package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom81 {

	public static void main(String[] args) {
		//Korisnik unosi cijeli broj
		//Program ispisuje broj 7 jedno ispod drugog
		//onoliko puta koliko je korisnik unio
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi broj"));
		
		for (int i =0; i<=x;i++) {
			System.out.println("7");
		}

	}

}
