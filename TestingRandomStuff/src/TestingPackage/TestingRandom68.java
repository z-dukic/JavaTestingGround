package TestingPackage;

public class TestingRandom68 {

	public static void main(String[] args) {

		int x = 18;
		boolean primBroj = true;

		for (int i = 2; i <= x; i++) {
			if (x % i == 0) {

				primBroj = false;
			} else {
				System.out.println("Broj koji si izabrao nije primaran");
				System.out.println("Broj " + x + " je cjelobrojno djeljiv sa " + i);
				break;

			}

		}if(primBroj) {
			System.out.println("Broj " + x + " je prim broj");
		}else {
			System.out.println("Broj " + x + " nije prim broj");
		}
	}
}
