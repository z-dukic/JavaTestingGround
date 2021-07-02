package TestingPackage02;

import javax.swing.JOptionPane;

public class Start {

	private Auti[] automobili;

	public Start() {
		// pokretanje metode
		automobili = new Auti[2];
		upisivanjeVrijednosti();
		ispisivanjeVrijednosti();
	}

	private void ispisivanjeVrijednosti() {
		for (Auti auto : automobili) {
			System.out.println(auto.getCijena());
			System.out.println(auto.getGodineProizvodnje());
			System.out.println(auto.getImeVlasnika());
			System.out.println(auto.getProizvodac());
			System.out.println(auto.getZemljaPodrijetla());
		}

	}

	private void upisivanjeVrijednosti() {
		Auti auto;

		for (int i = 0; i <= 1; i++) {
			auto = new Auti();
			auto.setCijena(JOptionPane.showInputDialog((i + 1) + "cijena"));
			auto.setGodineProizvodnje((JOptionPane.showInputDialog((i + 1) + "godina proizvodnje")));
			auto.setImeVlasnika(JOptionPane.showInputDialog((i + 1) + "Ime vlasnika"));
			auto.setZemljaPodrijetla(JOptionPane.showInputDialog((i + 1) + "Zemlja podjetla"));
			auto.setProizvodac(JOptionPane.showInputDialog((i + 1) + "Proizvodac"));
			automobili[i] = auto;
		}

	}

	public static void main(String[] args) {
		new Start();

	}

}
