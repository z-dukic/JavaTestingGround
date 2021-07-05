package TestingPackage;

public class TestingRandom99 {
	
	//Inf. loop
	static void metoda() {
		System.out.println("Ovo je rekurzija");
		metoda();
	}

	public static void main(String[] args) {
		metoda();
	}
}
