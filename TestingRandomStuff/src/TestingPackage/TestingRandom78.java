package TestingPackage;

public class TestingRandom78 {

	public static void main(String[] args) {
		// Kreirajte metodu primBroj tipa boolean koja za primljeni
		// cijeli broj vraæa true ako je prim ili false ako nije
		// prim broj

		// Kreirajte metodu primBrojevi tipa void koja prima
		// dva cijela broja
		// metoda ispisuje prim brojeve izmeðu dva primljena broja

		System.out.println(primBroj(13)); //Pozivanje prve metode

		TestingRandom78 pero = new TestingRandom78();

		pero.primarniBrojevi(3, 15); // Pozivanje druge metode

	}

	public static boolean primBroj(int x) {

		for (int i = 2; i < x; i++) { //klasični for loop za primarne brojeve
			if (x % i == 0) { // -II-

				System.out.println("Broj " + x + " nije primaran"); //Broj koji tražiš
				System.out.println("Broj je dijeljiv sa: " + i); //Broj s kojim je djeljiv
				return false; //Ako postoji, false je
			}
		}
		System.out.println("Broj " + x + " je primarni broj"); //Ako ne nađe, prim je
		return true;
	}

	public static void primarniBrojevi(int pocetniBroj, int zadnjiBroj) {

		
		// Ne radi - moram stavit while loop
		int[] lista;
		for (int i = pocetniBroj; i < zadnjiBroj; i++) {
			if (pocetniBroj % i == 0) {
				
				
			}
			i++;
		}

	}
}
