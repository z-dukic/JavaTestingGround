import java.time.LocalDate;

public class ifelsestate {

	public static void main(String[] args) {
	int a = 5;
	int b = 6;
	int c = a + b;
	System.out.println(c + " is the result of a + b");
	
	if (a > b) {
		System.out.println("This is a very good code");}
		else {
			System.out.println("this code is not that good");
		}
		
	LocalDate MojeVrijeme = LocalDate.now();
	System.out.println("Vrijeme u Osijeku je" + MojeVrijeme);
	
	}

	}


