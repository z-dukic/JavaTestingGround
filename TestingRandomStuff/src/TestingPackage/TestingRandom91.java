package TestingPackage;

public class TestingRandom91 {

	public static void main(String[] args) {
		// Kreirajte metodu primBroj tipa boolean koja za primljeni
				// cijeli broj vraæa true ako je prim ili false ako nije
				// prim broj
			
		TestingRandom91 pero = new TestingRandom91();
		pero.primBroj(10);


	}
	public static boolean primBroj(int broj) {
		
		
		for (int i=2;i < broj;i++) {
			if(broj % i==0) {
				System.out.println("Broj nije primarni");
				return false;
			}
		}
		System.out.println("Broj je primarni");
		return true;
	}
	

}

