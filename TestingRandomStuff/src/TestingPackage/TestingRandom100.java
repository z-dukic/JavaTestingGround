package TestingPackage;

public class TestingRandom100 {

	static int broj = 0;

	static void metoda() {
		broj++;
		if (broj <= 5) {
			System.out.println("hello " + broj);
			metoda();
		}
	}

	public static void main(String[] args) {
		metoda();
	}

}
