package TestingPackage;

public class TestingRandom09 {

	public static void main(String[] args) {
		
		// Ako je bilo koji broj double pokazat æe se kao double
		double a = 3.0 / 2;
		double b = 3 / 2.0;
		System.out.println(a + " and " + b);
		
		int c = 3;
		int d = 2;
		
		// Double možeš staviti bilo gdje da se pokazuje kao double
		double e = (double) c / d;
		System.out.println(e);
		
		// Double možeš staviti bilo gdje da se pokazuje kao double
		double f = c / (double) d;
		System.out.println(f);
		
		// Ako staviš double broj ispred onda se sve ponašao kao double
		int g = 3;
		int h = 2;
		System.out.println(1.0 * g / h);
		
		

	}

}
