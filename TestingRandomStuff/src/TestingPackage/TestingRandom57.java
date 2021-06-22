package TestingPackage;

import java.util.Arrays;

public class TestingRandom57 {
	public static void main(String[] args) {
		// https://www.journaldev.com/33358/java-string-functions-methods
		// 25 najkorištenih metoda

		// 1. length()
		// Koliko znakova ima string
		String ime = "Marijan";
		System.out.println(ime.length());

		// 2. isEmpty(), isBlank()
		// isEmpty kaže true ako nema nijedna znak; is blank može zadržavati prazni
		// prostor (razmak), ali bez znakova
		System.out.println(ime.isBlank()); // false
		System.out.println(ime.isEmpty()); // false

		// 3. charAt(int index)
		// Pokazuje što se nalazi na mjestu (počinje od 0)
		System.out.println(ime.charAt(2));

		// 4. getChars() and toCharArray()
		char c = ime.charAt(0);
		
		char[] imeArray = ime.toCharArray();	
		
		System.out.println(ime + " String index 0 character = " + c);
		System.out.println(ime + " String converted to character array = " + Arrays.toString(imeArray));
		

	}
}
