package TestingPackage;

public class TestingRandom71 {

	public static void main(String[] args) {
		// Ulaz u program je niz znakova koji sadrži
		// imena gradova razdvojeno zarezom
		// Program ispisuje naziv grada koji u sebi ima najmanje znakova

		// Primjer ulaza: "Osijek, Zagreb, Varaždin, Sinj, Donji Miholjac"
		// Sinj

		String s = "Osijek, Zagreb, Varaždin, Sinj, Donji Miholjac"; // inicijalizacija stringa
		String[] gradovi = s.split(","); // Maknio zareze iz stringa, gradovi postaju array
		int najmanji = Integer.MAX_VALUE; // Najveći broj koji integer može imati
		int index = 0;

		for (int i = 0; i < gradovi.length; i++) { // ubacuje int i u gradove tako da lista svaki string
			if (gradovi[i].trim().length() < najmanji) { // gradovi(array) pokazuju redom(i); trim() miče sve osim samih
															// slova iz arraya; length pokazuje broj slova; taj broj
															// mora biti manji od najmanji integera
				najmanji=gradovi[i].trim().length(); //daje vrijednost najmanji = grad sa najmanje slova
				index=i; //?
				
			}

				}			System.out.println(gradovi[index].trim().toUpperCase()); // Nabroji sve gradove jedna po jedan
				for(String grad: gradovi) {
					if(grad.trim().length()==najmanji) {
						System.out.println(grad.trim().toLowerCase());
			}
		}
	}

}
