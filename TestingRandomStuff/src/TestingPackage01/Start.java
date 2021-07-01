package TestingPackage01;

import javax.swing.JOptionPane;

public class Start {

	private Korisnik[] osoba;

	public Start() {
		// start za sve metode
		osoba = new Korisnik[2];
		UvodenjeKorisnika();
		IspisivanjeKorisnika();
	}

	private void IspisivanjeKorisnika() {
		for (Korisnik covjek : osoba) {
			System.out.println(covjek.getIme());
		}

	}

	private void UvodenjeKorisnika() {
		Korisnik covjek;

		for (int i = 0; i < 2; i++) {
			covjek = new Korisnik();
			covjek.setIme(JOptionPane.showInputDialog((i + 1) + ". ime"));
			covjek.setPrezime(JOptionPane.showInputDialog((i + 1) + ". prezime"));
			covjek.setOib(JOptionPane.showInputDialog((i + 1) + ". OIB"));
			covjek.setDob(Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Dob")));
			osoba[i] = covjek;

		}

	}

	public static void main(String[] args) {
		new Start(); // pokreće metodu
	}
}
