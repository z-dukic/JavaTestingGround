package TestingPackage;

public class TestingRandom87 {

	public static void main(String[] args) {
		// Kreirati metodu tipa int naziva suma
				// koja prima niz cijelih brojeva
				// metoda vraæa sumu svih brojeva u nizu

				// Metodu pozvati iz main metode

		int[]niz = {2,35,6,7};	
		System.out.println(suma(niz));

	}
	
	public static int suma (int[]niz) {
		int zbroj=0;
		
		for (int i=0;i<niz.length;i++) {
			zbroj += niz[i];
		}
		
		return zbroj;
	}

}
