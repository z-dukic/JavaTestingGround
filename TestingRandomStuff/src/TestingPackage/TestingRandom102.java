package TestingPackage;

public class TestingRandom102 {

	// Fibonaccijev niz
	// Vratit se ovome
	
	static int n1 = 0, n2 = 1, n3 = 0;

	static void Fibonacci(int broj) {
		if (broj > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			Fibonacci(broj - 1);
		}
	}

	public static void main(String[] args) {
		int broj = 10;
		System.out.print(n1 + " " + n2);
		Fibonacci(broj - 2);

	}

}
