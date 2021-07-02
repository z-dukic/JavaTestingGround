package TestingPackage03;

import javax.swing.JOptionPane;

public class Start {

	private Bendovi[] block;

	public Start() {
		block = new Bendovi[1];
		ucitajInformacije();
		ispisivanjeInformacija();

	}

	private void ispisivanjeInformacija() {
		for (Bendovi bend : block) {
			System.out.println(bend.getIme());
			System.out.println(bend.getZanr());
			System.out.println(bend.getGodinaOsnivanja());
		}

	}

	private void ucitajInformacije() {
		Bendovi bend;

		for (int i = 0; i < 1; i++) {
			bend = new Bendovi();
			bend.setGodinaOsnivanja(JOptionPane.showInputDialog("Daj mi godinu osnutka"));
			bend.setIme(JOptionPane.showInputDialog("Daj mi jedna bend"));
			bend.setZanr(JOptionPane.showInputDialog("Koji je zanr"));
			block[i] = bend;
		}

	}

	public static void main(String[] args) {
		new Start();
	}

}
