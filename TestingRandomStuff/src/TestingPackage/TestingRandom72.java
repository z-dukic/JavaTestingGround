package TestingPackage;

public class TestingRandom72 {

	public static void main(String[] args) {

		// Ulaz je ime i prezime
		// Izlaz email adresa u Edunovi

		String ime = "Zoran Dukic"; // iniciranje stringa
		String[] imeBezZnakova = ime.split(" "); // podjela stringa na array
		String email = " "; // iniciranje emaila za završni "proizvod"
		email = imeBezZnakova[0].substring(0, 1) + imeBezZnakova[1]; // email = imeBezZnakova[nulti
																		// array].substring[počni od, završni do] +
																		// drugi array.

		System.out.println(email.toLowerCase() + "@edunova.hr"); // Printaj email malim slovima i dodaj edunova

	}

}
