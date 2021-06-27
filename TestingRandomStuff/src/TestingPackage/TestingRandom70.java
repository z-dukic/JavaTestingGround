package TestingPackage;

public class TestingRandom70 {

	public static void main(String[] args) {

		// pomoæu while petlje ispišite sve parne brojeve
		// od 3 do 22 uz iznimku brojeva 8 i 10 (njih ne treba ispisati)

		int i = 3;
		while (i <= 22) {
			if (i % 2 == 0 && !(i == 8 || i == 10)) {
				System.out.println(i);

			}
			i++;
		}

		// s pomoæu do while petlje zbrojite prvih 100 brojeva
		// ispišite rzultat

		int x = 100;
		int suma = 0;
		while (0 <= x) {
			suma+=x;
			
		}
		System.out.println(suma);
		x++;

	}
}
