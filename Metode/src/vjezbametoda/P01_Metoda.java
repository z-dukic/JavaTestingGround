package vjezbametoda;


public class P01_Metoda {

	 void ispis() {
		String ime = "Nešto novo";
		System.out.println("Hello" + ime);

	}

	public void ispis2(String ime) {
		System.out.println("Druga metoda + " + ime);
	}
	
	private int ispis3() {
		System.out.println("Treca metoda");
				return 5;
			}
	
	protected int ispis3(int x, int y) {
		System.out.println("Ovo je treća metoda: " + (x+y));
		return x+y;
	}
}
