package TestingPackage;

public class TestingRandom55 {

	public static void main(String[] args) {
		String ime = "Zoki testira kod, kod testira Zokija";

		System.out.println(ime.toUpperCase());
		System.out.println(ime.indexOf("je")); // pokazuje na kojoj se poziciji nalazi ono što tražiš, prvi put. Indexi
												// se mogu zbrajati

		System.out.println(ime.charAt(2)); // pokazuje šta se nalazi na određenoj poziciji

		String prezime = "Pero";
		System.out.println(prezime.codePointAt(0)); //vraća index prvog broja
		System.out.println(prezime.compareTo(ime)); //uspoređje indexe dvije riječi, ako su iste vrati nula
		System.out.println(prezime.equalsIgnoreCase(prezime)); //ako su dva stringa ista vrati true, ako nisu vrati false
		System.out.println(prezime.codePointBefore(2)); //pokazuje index iz stringa. počinje od 1, ne od nule
	}

}
