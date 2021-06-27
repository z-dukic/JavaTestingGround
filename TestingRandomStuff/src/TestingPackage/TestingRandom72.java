package TestingPackage;

public class TestingRandom72 {

	public static void main(String[] args) {
	
		// Ulaz je ime i prezime
		// Izlaz email adresa u Edunovi
		
		String ime = "Zoran Dukic";
		String [] imeBezZnakova = ime.split(" ");
		String email=" ";
		email= imeBezZnakova[0].substring(0, 1) + imeBezZnakova[1];
		
		System.out.println(email.toLowerCase() + "@edunova.hr");

	}

}
