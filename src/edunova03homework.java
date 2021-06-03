import javax.swing.JOptionPane;

public class edunova03homework {

	public static void main(String[] args) {

		// Dodavanje varijable i printanje varijable
		int a = 10;
		System.out.println(a);

		// Dodaj varijablu b, Integer.parseInt znaèi da int daje vrijednost intu,
		// JOptionPane stvara panel, showInputDialog kaže da korisnik mora unijeti nešto
		// int b = Integer.parseInt(JOptionPane.showInputDialog("Daj mi jedan broj po
		// izboru"));
		// int c = a + b;
		// System.out.println(c);

		int d = 30;

		// Ako je a > b onda pokazuje vrijednost manju od nule iliti -1, ako je a < b
		// onda pokazuje vrijednost veæu od nule iliti 1.
		int e = Integer.compare(a, d);
		System.out.println(e);

		// Pokazuje najveæi vrijednost koju integer može imati
		System.out.println(Integer.MAX_VALUE);

		// Koliko ima bitova u int f (ima 32 bita pošto je int)
		int f = Integer.SIZE;
		System.out.println(f);

		// Pokazuje koliko bitova je iskorišteno pri zapisivaju tog broja
		int g = Integer.highestOneBit(d);
		System.out.println(g);

		int h = Integer.sum(a, d);
		System.out.println(h);

		// Signum vraæa 1 ako je broj pozivitan, a ako je negativan vraæa -1.
		int u = Integer.signum(d);
		System.out.println(u);

		// Pretvara string u integer. Da nema Integer.parseInt kad bi išao print
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
