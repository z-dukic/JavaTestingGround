package TestingPackage;

public class TestingRandom76 {

	public static void main(String[] args) {

		// Kreirajte metodu razlika tipa int koja
		// prima dva parametra tipa String
		// Metoda vraæa razliku prvog i drugog primljenog broja

		System.out.println(metoda("5", "3")); //sysout metoda sa dva stringa koji se pretvore u int

	}

	public static int metoda(String parametar1, String parametar2) {  // Metoda koja uzima dva stringa tipa int
		Integer x = Integer.valueOf(parametar1); // Prvi parametar
		Integer y = Integer.valueOf(parametar2); // Drugi parametar

		return x - y; //return dva brojeva koja zoveš u metodi
	}

}
