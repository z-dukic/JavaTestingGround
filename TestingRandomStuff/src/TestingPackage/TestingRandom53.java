package TestingPackage;

public class TestingRandom53 {

	public static void main(String[] args) {

		int[] array = { 0, 1, 2, 3, 4, 5, 6 };
		for (int x = 0; x < array.length; x++) {
			if (x == 0) {
				System.out.println("Opcija 1");
			} else if (x == 1) {
				System.out.println("Opcija 2");
			} else {

				System.out.println("Sve ostale opcije su: " + array[x]);
			}
		}

		int zbroj = 0;
		for (int i = 0; i <= 100; i++) {
			zbroj += i;
		}
		System.out.println(zbroj);

		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5; b++) {
				System.out.print(0 + "");
			}
			System.out.println();
			}
		
		
		
		} 
	
	

	}


