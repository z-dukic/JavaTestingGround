package TestingPackage;

public class TestingRandom09 {

	public static void main(String[] args) {
		
		// Ako je bilo koji broj double pokazat �e se kao double
		double a = 3.0 / 2;
		double b = 3 / 2.0;
		System.out.println(a + " and " + b);
		
		int c = 3;
		int d = 2;
		
		// Double mo�e� staviti bilo gdje da se pokazuje kao double
		double e = (double) c / d;
		System.out.println(e);
		
		// Double mo�e� staviti bilo gdje da se pokazuje kao double
		double f = c / (double) d;
		System.out.println(f);
		
		// Ako stavi� double broj ispred onda se sve pona�ao kao double
		int g = 3;
		int h = 2;
		System.out.println(1.0 * g / h);
		
		

	}

}
