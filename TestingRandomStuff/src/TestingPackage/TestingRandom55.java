package TestingPackage;

import java.util.Arrays;

public class TestingRandom55 {

	public static void main(String[] args) {
		String ime = "Zoki testira kod, kod testira Zokija";

		System.out.println(ime.toUpperCase());
		System.out.println(ime.indexOf("je")); // pokazuje na kojoj se poziciji nalazi ono što tražiš, prvi put. Indexi
												// se mogu zbrajati

		System.out.println(ime.charAt(2)); // pokazuje šta se nalazi na određenoj poziciji

		String prezime = "Pero";
		System.out.println(prezime.codePointAt(0)); // vraća index prvog broja
		System.out.println(prezime.compareTo(ime)); // uspoređje indexe dvije riječi, ako su iste vrati nula
		System.out.println(prezime.equalsIgnoreCase(prezime)); // ako su dva stringa ista vrati true, ako nisu vrati
																// false
		System.out.println(prezime.codePointBefore(2)); // pokazuje index iz stringa. počinje od 1, ne od nule

		String nadimak = "Zoki";
		System.out.println(nadimak.hashCode());

		double broj = 3 / (double) 35;
		System.out.println(broj);
		String broj2 = String.valueOf(broj);

		System.out.println(broj2.substring(broj2.length()));

		System.out.println(broj2.substring(2));
		System.out.println();

		String pojam = "2,3,4,3,2,3,3";
		System.out.println(pojam);
		System.out.println(pojam.indexOf(",", 5));
		for (int i = 0; i < pojam.length(); i++) {
			System.out.print(pojam.charAt(i));
		}
		String[] niz = pojam.split(",");
		System.out.println(Arrays.toString(niz));

		int suma = 0;
		for (String e : niz) {
			suma += Integer.parseInt(e);
		}
		System.out.println(suma);

		String BiloKojeIme = "Ivan,Ivana, Ivano";
		System.out.println(BiloKojeIme.concat(broj2));
		
		
	}

}
