package TestingPackage;

public class TestingRandom101 {

	static int faktorijel(int n) {
		if (n == 1)
			return 1;
		else
			return (n * faktorijel(n - 1));
	}

	public static void main(String[] args) {
		System.out.println("faktorijel od 5 je: " + faktorijel(5));
		// 5! = 5*4*3*2*1
		// Kreće od 1*1 pa 2*1 pa 3*2 pa 6*4 pa 5*24 = 120
		
		

	}
}
