package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom26 {

	public static void main(String[] args) {
		int x;
		int y;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi X."));
		y = Integer.parseInt(JOptionPane.showInputDialog("Daj mi y."));
		
		while (x < 5) {

			System.out.println(x);
			x++;
		}
		while(y<5) {
			System.out.println(y);
			y++;
		}
		
		if(x<y) {
			System.out.println("X je veæi od y");
			
		}else if (x>y) {
			System.out.println("Y je veæi od X");
			
		}else {
			System.out.println("Y i X su isti.");
		}

	}

}
