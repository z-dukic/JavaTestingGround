package TestingPackage;

public class TestingRandom74 {

	public static void main(String[] args) {

		// Kreirati metodu tipa int naziva suma
		// koja prima niz cijelih brojeva
		// metoda vraæa sumu svih brojeva u nizu

		// Metodu pozvati iz main metode
		
		// Verzija sa for

		// Step 2
		Integer[] niz = { 1, 45, 6 }; // parametri koji ulaze u metodu
		System.out.println(suma(niz)); // printaj metodu(niz)
	}

	public static int suma(Integer[] niz) {

		// Step1 
		int suma = 0; // inciranje sume koja će pohranit vrijednost

		for (int i = 0; i < niz.length; i++) { //počni sa 0; i je najveće dužina niza (ukupno članova); i++

			suma = suma + niz[i]; //suma svih brojeva u nizu

		}

		return suma; // vrati sumu

	}

}
