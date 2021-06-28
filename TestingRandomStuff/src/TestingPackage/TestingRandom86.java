package TestingPackage;

public class TestingRandom86 {

	public static void main(String[] args) {
		// Kreirajte metodu razlika tipa int koja
		// prima dva parametra tipa String
		// Metoda vraæa razliku prvog i drugog primljenog broja

		
		System.out.println(razlika("2","3"));
		
	}

	public static int razlika(String parametar1, String parametar2) {

		int x = Integer.valueOf(parametar1);
		int y = Integer.valueOf(parametar2);
		

		return x - y;
	}

}
