package TestingPackage;

import javax.swing.JOptionPane;

public class Start {

	// Napišite program koji za Raèunalo unosi 3 svojstva
	// Program unosi 5 raèunala
	// Program ispisuje jedno odabrano svojstvo raèunala

	private Racunala[] kompovi; // Iniciras klasu racunala [] kompovi;

	public Start() { // start za sve metode
		kompovi = new Racunala[5]; // kompovi će sadržavat 5 računala
		ucitajInformacije(); // metoda koja sluzi da ucitas sve informacije (settaš)
		ispisiRacunala(); // metoda koja služi da vratiš sve informacije (gettaš)
	}

	private void ispisiRacunala() {

		for (Racunala komp : kompovi) { // Ispisi sve elemente u arrayu kompovi

			System.out.println(komp.getGodinaProizvodnje()); // objekt i metoda
		}

	}

	private void ucitajInformacije() {
		Racunala komp; // Uvedeš komp

		for (int i = 0; i < 5; i++) { // Unosim svojstva za 5 racunala
			komp = new Racunala(); // komp je novo racunalo
			komp.setProizvodac(JOptionPane.showInputDialog("Daj mi ime proizvodaca GPU")); // set 1
			komp.setCpu(JOptionPane.showInputDialog("Unesi ime proizvodaca CPU")); // set2
			komp.setGodinaProizvodnje(Integer.parseInt(JOptionPane.showInputDialog("Unesi godinu proizvodnje"))); // set3
			kompovi[i] = komp; //idi redom, traži za svaki vrijednost

		}

	}

	public static void main(String[] args) {
		new Start(); // deklariraš da je nakon što uđe u main ide u start (gdje se pokreće sve
						// ostalo)
	}
}
