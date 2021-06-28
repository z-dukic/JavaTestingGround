package TestingPackage;

public class TestingRandom73 {

	public static void main(String[] args) {
		// Kreirati metodu tipa int naziva suma
		// koja prima niz cijelih brojeva
		// metoda vraæa sumu svih brojeva u nizu

		// Metodu pozvati iz main metode

		// Step 2
		Integer[] niz = { 1, 45, 6 }; // parametri koji ulaze u metodu
		System.out.println(suma(niz)); // printaj metodu(niz)
	}

	public static int suma(Integer[] niz) {

		// Step1
		int suma = 0; // inciranje sume koja će pohranit vrijednost

		for (int broj : niz) { // for each loop; za svaki broj u nizu dodjeli jedan broj. 1=10, 2=20, 3=30
			suma += broj; // suma svih brojeva

		}

		return suma; // vrati sumu

	}

}
