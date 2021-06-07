package TestingPackage;

public class TestingRandom10 {

	public static void main(String[] args) {
		int first = (1 + 1); // rez: 2, nema printa
		int second = first + 3 * (2 + 5); // rez: 23
		
		first = 5; //rez: 5, nema printa
		
		int third = first + second; //rez: 23 + 5; int second dobije prvi first value, a nakon toga first mjenja vrijednost u 5.
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);

	}

}
