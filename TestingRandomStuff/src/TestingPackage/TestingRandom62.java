package TestingPackage;

public class TestingRandom62 {

	public static void main(String[] args) {

		// Kreirajte metodu razlika tipa int koja
		// prima dva parametra tipa String
		// Metoda vraća razliku prvog i drugog primljenog broja
		
		TestingRandom62 test = new TestingRandom62();
		zadatak("2","5");
		System.out.println(zadatak("2","5"));

	}

	public static int zadatak(String parametar1, String parametar2) {
		Integer x = Integer.valueOf(parametar1);
		Integer y = Integer.valueOf(parametar2);

		return x-y;
	}

}
