package TestingPackage;

import java.util.Arrays;

public class TestingRandom41 {

	public static void main(String[] args) {
		int[] brzo = { 2, 3, 5, 6, 7, 4, 3 };

		System.out.println(brzo);
		System.out.println(Arrays.toString(brzo));
		System.out.println(brzo[1]);

		System.out.println();

		int preskoci = 5;
		for (int i = 0; i < 10; i++) {
			if (preskoci == i) {
				continue;

			}
			System.out.println(i);
		}

		System.out.println();
		// ognje��ivanje petlje
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}

	}
}
