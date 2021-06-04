package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom01 {

	public static void main(String[] args) {
		
		
		//Integer.parseInt(ime) pretvara string u int
		String ime = "5";
		int y = Integer.parseInt(ime);
				
		
		//JOptionPane.showInputDialog() otvara kuæicu gdje user upisuje broj
		int a = 10;
		int b;
		b = Integer.parseInt(JOptionPane.showInputDialog("Daj mi neki broj"));
		int c = a + b;
		
		int x = c + y;
		System.out.println(x);
		
		
		
		

	}

}
