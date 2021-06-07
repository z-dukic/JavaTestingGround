package TestingPackage;

public class TestingRandom11 {

	public static void main(String[] args) {

		// Prva recenica se pokazuje zato sto nema uvijeta, druga recenica se pokazuje
		// zato sto je true, treca se ne pokazuje zato sto je false
		System.out.println("Prva recenica");
		if (true) {
			System.out.println("Druga recenica");
		}
		if (false) {
			System.out.println("Treca recenica");
		}

		System.out.println("prikazi ako je broj veæi od 10");
		int a = 9;
		if (a > 10) {
			System.out.println("Broj je veæi od 10");

		}

	}

}
