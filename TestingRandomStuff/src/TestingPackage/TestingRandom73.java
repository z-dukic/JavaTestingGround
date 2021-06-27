package TestingPackage;

public class TestingRandom73 {

	public static void main(String[] args) {
		// Kreirati metodu tipa int naziva suma 
		// koja prima niz cijelih brojeva
		// metoda vraæa sumu svih brojeva u nizu
		
		// Metodu pozvati iz main metode
		
		Integer[]niz= {1,45,6};	
		System.out.println(suma(niz));
	}
	
	public static int suma(Integer[]niz) {
		
		int suma=0;
		
		for(int broj : niz) {
			suma+=broj;
			
		}
		
		return suma;
		
	}

}
