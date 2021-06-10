package TestingPackage;

import java.util.Scanner;

public class TestingRandom28 {
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Daj mi jedan broj. Ako unesem broj 4 program zavrsava");
			int x = Integer.valueOf(scanner.nextLine());
			
			if(x==4) {
				
				break;
			
			}System.out.println("To nije broj 4. Molim te probaj ponovo");
			
			
		}System.out.println("Hvala sto si unio broj 4. Program tu zavrsava.");
		
		
	
}

}
