package TestingPackage;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TestingRandom46 {

	public static void main(String[] args) {
		// Program unosi 10 cijelih brojeva od korisnika
		// u jednodimenzionalni niz
		// Program ispisuje sve elemente niza

		int niz[] = new int[10];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj Z"));
		}
		System.out.println(Arrays.toString(niz));

		// Prim broj je broj koji je cjelobrojno djeljiv sam s sobom
		// i s broj 1.
		// Za uneseni broj x = 27353 ispišite da li je prim broj

		int x = 27353;
		boolean primBroj = true;

		for(int i=2;i<(x/2);i++) {

			if(x%i==0) {
				primBroj = false;
				System.out.println("Broj " + x + " je cjelobrojno djeljiv sa " + i);
				break;
			}			

		}

		if(primBroj) {
			System.out.println("Broj " + x + " je prim broj");
		}else {
			System.out.println("Broj " + x + " nije prim broj");
		}
			}
		}


