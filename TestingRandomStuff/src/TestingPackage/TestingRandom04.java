package TestingPackage;

import java.util.Scanner;

public class TestingRandom04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Upisi prvi string");
		String prvi = scanner.nextLine();
		System.out.println("Upisi drugi string");
		String drugi = scanner.nextLine();
		System.out.println("Upisi treci string");
		String treci = scanner.nextLine();
		
		System.out.println("Upisao si sljedece stringove: ");
		System.out.println(prvi);
		System.out.println(drugi);
		System.out.println(treci);
	}

}
