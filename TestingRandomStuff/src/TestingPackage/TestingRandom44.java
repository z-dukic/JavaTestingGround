package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom44 {

	public static void main(String[] args) {
		// Program ispisuje sve brojeve od 100 do 21
		// jedno do drugoga odvojeno zarezom


		int pocetak = 100;
		int kraj = 21;

		for (int i = pocetak; i >= kraj; i--) {
			System.out.print(i+ " , ");
		}
		
		// Program uèitava cijele brojeve od korisnika
		// sve dok se ne uèita broj 0. Tada se program završava
		
		int x;
		
		for(;;) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi jedan broj, kada uneseš nula program završava"));
			if(x==0) {
				break;
			}
		}
		
	}

}
