package TestingPackage;

public class TestingRandom64 {
	// Kreirajte metodu aritmetièkas sredina tipa float
	// metoda prima niz cijelih brojeva
	// metoda vraæa aritmetièku sredinu svih primljenih brojeva

	public static float[] aretmetickaSredina(int[]niz) {
		float[]pero = {10.25f,11.75f,35.17f};


		int zbroj = 0;
		float sredina = 0;

		for (int i = 0; i < pero.length; i++) {
			zbroj += niz[i];
			

		}
		
		return (float)zbroj/niz.length;
	}

	public static void main(String[] args) {
		TestingRandom63 z = new TestingRandom63();
		z.aretmetickaSredina();

	}

}


/*
		float[] pero;
		pero = new float[10];
		pero[1]=10;
		pero[3]=50;
		pero[5]=100;

for (int i : niz)
*/
