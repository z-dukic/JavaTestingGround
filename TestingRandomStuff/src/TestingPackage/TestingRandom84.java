package TestingPackage;

public class TestingRandom84 {

	public static void main(String[] args) {
		// Kreirati metodu tipa int naziva suma
		// koja prima niz cijelih brojeva
		// metoda vraæa sumu svih brojeva u nizu

		// Metodu pozvati iz main metode

		
		Integer [] niz= {5,6,8,9,10};
		System.out.println(suma(niz));
	}

	public static int suma(Integer[] niz) {

		int suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
			
			
		}

		return suma;
	}

}
