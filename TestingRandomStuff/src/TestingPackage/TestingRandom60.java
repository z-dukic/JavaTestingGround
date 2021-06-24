package TestingPackage;

import java.util.Arrays;

public class TestingRandom60 {

	// kreirati metodu tipa int suma
	// koja prima niz cijelih brojeva
	// metoda vraća sumu svih brojeva u nizu

	// metodu pozvati iz main metode
	
	//K01_Metode m = new K01_Metode();

	public static void main(String[] args) {
		int[]niz= {2,3,4};
		//TestingRandom60 test = new TestingRandom60();
		System.out.println(Arrays.toString(niz));
		// TestingRandom60.suma(niz);
		System.out.println(TestingRandom60.suma(niz));

		
		///xxxxx
	}

	public static int suma(int[] niz) {
		int suma = 0;

		for (int i : niz) {
			suma += i;
		}
		return suma;
		
	}

}
