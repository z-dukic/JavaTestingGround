import javax.swing.JOptionPane;

public class edunova03homework {

	public static void main(String[] args) {

		// Dodavanje varijable i printanje varijable
		int a = 10;
		System.out.println(a);

		// Dodaj varijablu b, Integer.parseInt zna�i da int daje vrijednost intu,
		// JOptionPane stvara panel, showInputDialog ka�e da korisnik mora unijeti ne�to
		// int b = Integer.parseInt(JOptionPane.showInputDialog("Daj mi jedan broj po
		// izboru"));
		// int c = a + b;
		// System.out.println(c);

		int d = 30;

		// Ako je a > b onda pokazuje vrijednost manju od nule iliti -1, ako je a < b
		// onda pokazuje vrijednost ve�u od nule iliti 1.
		int e = Integer.compare(a, d);
		System.out.println(e);

		// Pokazuje najve�i vrijednost koju integer mo�e imati
		System.out.println(Integer.MAX_VALUE);

		// Koliko ima bitova u int f (ima 32 bita po�to je int)
		int f = Integer.SIZE;
		System.out.println(f);

		// Pokazuje koliko bitova je iskori�teno pri zapisivaju tog broja
		int g = Integer.highestOneBit(d);
		System.out.println(g);

		int h = Integer.sum(a, d);
		System.out.println(h);

		// Signum vra�a 1 ako je broj pozivitan, a ako je negativan vra�a -1.
		int u = Integer.signum(d);
		System.out.println(u);

		// Pretvara string u integer. Da nema Integer.parseInt kad bi i�ao print
		// izbacilo bi ti 100 +1 = kao 1001
		String i = "5";
		System.out.println(Integer.parseInt(i) + 10);

		int z = Integer.parseInt("7");
		System.out.println(z);

		// JPaneOption isprobavanje, 
		int q = Integer.parseInt(JOptionPane.showInputDialog("Hello from the other side"));
		System.out.println(q);
		

	}

}
