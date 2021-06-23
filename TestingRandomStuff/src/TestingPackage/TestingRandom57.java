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

		// 5. getBytes()
		// Pokazuje koliko svako slovo ima bytova
		String s1 = "Hello";
		byte[] barr = s1.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);

		}

		// 6. equals(), hashCode() and equalsIgnoreCase()
		// Equals pokazuje dali su dva stringa ista
		// hashCode pokazuje capchu broja koji je stvoren u memoriji
		// equalsIgnoreCase() dali su dva broja ista s tim da nije bitno dali je caps
		// ili ne

		String s4 = "Edunova";
		System.out.println(s4.equals("Hello"));
		System.out.println(s4.hashCode());
		System.out.println(s4.equalsIgnoreCase("EduNovA"));

		// 7. contentEquals()
		// Pokazuje dali su dva stringa ista s tim da provjerava klasu, a ne samo objekt
		// String buffer je isti kao string, ali sadrži manje znakova i može se mjenjati
		// pomoću nekih metoda

		// Primjer A
		String str1 = "Not immutable";
		String str2 = "Strings are immutable";
		StringBuffer str3 = new StringBuffer("Not immutable");

		boolean result = str1.contentEquals(str3);
		System.out.println(result);

		result = str2.contentEquals(str3);
		System.out.println(result);

		// Primjer2
		https://www.javatpoint.com/StringBuffer-class
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
	}
}
