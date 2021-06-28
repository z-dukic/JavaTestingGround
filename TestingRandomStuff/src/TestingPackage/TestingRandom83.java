package TestingPackage;

public class TestingRandom83 {

	public static void main(String[] args) {
		// Program unosi 5 cijelih brojeva u niz
		// Program ispisuje najveæi uneseni broj

		int[]niz = {1,2,57,2,4};
		int najveciBroj = 0;
		
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] > najveciBroj) {
				najveciBroj = niz[i];
			}
		}

		System.out.println("Najveći broj u nizu je: " + najveciBroj);

	}
}
