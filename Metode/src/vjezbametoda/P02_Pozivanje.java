package vjezbametoda;

import java.util.Scanner;

public class P02_Pozivanje {
	
	public static void main(String[] args) {
		P01_Metoda x = new P01_Metoda();
		// 1.metoda
		x.ispis();

		// 2.metoda
		x.ispis2("Zoki");

		// 3.metoda - ne radi zato što ne možeš pozvati private u drugu klasu
		// x.ispis3();

		//4.metoda - 
		x.ispis3(25, 20);	
		
		
	}


}
