package TestingPackage;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TestingRandom38 {

	public static void main(String[] args) {
		// Program u�itava 5 decimalnih brojeva u niz
		// Program ispisuje prvi i posljednji element niza

		double[] prviArray = { 1.15, 2.5, 3.25, 4.15, 5.23 };

		System.out.println(prviArray[0] + prviArray[4]);

		// Program preko args parametara prima dva cijela broja
		// Program ispisuje zbroj primljenih brojeva
		System.out.println(Arrays.toString(args));

		// Korisnik unosi cijeli broj
		// Program ispisuje broj 7 jedno ispod drugog
		// onoliko puta koliko je korisnik unio
		int x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi jedan broj"));

		for (int i = 0; i < x; i++) {
			System.out.println(7);
		}
		;

		// program ispisuje sve parne brojeve od 1 do 55
		// U petlji obavezno koristiti vrijednosti 1 i 55

		for (int i = 1; i <= 55; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		/*
		 * //lo�e rje�enje public static void main(String[] args) { for(int
		 * i=2;i<=54;i+=2) { System.out.println(i); } }
		 */

		// Program unosi 5 cijelih brojeva u niz
		// Program ispisuje najve�i uneseni broj

		int[] drugiArray = { 1, 2, 8, 4, 5 };
		int max = 0;
		for (int i = 0; i < drugiArray.length; i++) {
			if (drugiArray[i] > max) {
				max = drugiArray[i];
			}

		}
		System.out.println(max);

		int[] treciArray = { 5, 6, 8, 9, 563, 1 };
		int prviNajveciBroj = 0;
		int drugiNajveciBroj = 0;

		for (int i = 0; i < treciArray.length; i++) {
			if (treciArray[i] > prviNajveciBroj) {
				drugiNajveciBroj = treciArray[i];
				prviNajveciBroj = treciArray[i];
			} else if (treciArray[i] > drugiNajveciBroj) {
				drugiNajveciBroj = treciArray[i];
			}
		}System.out.println(prviNajveciBroj);
		System.out.println(drugiNajveciBroj);

	}

}
