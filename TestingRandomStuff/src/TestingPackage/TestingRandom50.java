package TestingPackage;

import javax.swing.JOptionPane;

public class TestingRandom50 {

	public static void main(String[] args) {
		// Za dva dana broja ispišite decimalni dio rezultata
		// djeljenja
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Daj mi x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Daj mi y"));
		double sum1;
		int sum2;
		double sum3;
		
		sum1= (double)x/y;
		System.out.println(sum1);
		sum2=x/y;
		System.out.println(sum2);
		sum3= sum1 - sum2;
		System.out.println(sum3);

	}

}
