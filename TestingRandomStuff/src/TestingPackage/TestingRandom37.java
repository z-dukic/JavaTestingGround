package TestingPackage;

import java.util.Arrays;

public class TestingRandom37 {

	public static void main(String[] args) {
		int [] brojevi= {0,1,2,3,4,5,6};
		System.out.println(Arrays.toString(brojevi));
		
		int[][] tablica=new int[3][3];
		
		tablica[0][0]=1;
		tablica[0][1]=0;
		tablica[0][2]=0;
	
		tablica[1][0]=0;
		tablica[1][1]=1;
		tablica[1][2]=0;
	
		tablica[2][0]=0;
		tablica[2][1]=0;
		tablica[2][2]=1;
		
		System.out.println();
		System.out.println(Arrays.deepToString(tablica));
		System.out.println();
	
		System.out.println(Arrays.toString(tablica[0]));
		System.out.println(Arrays.toString(tablica[1]));
		System.out.println(Arrays.toString(tablica[2]));
		
		
		char[][] msg = new char[2][5];
		
		msg[0][0]= 's';
		msg[0][1]= 'e';
		msg[0][2]= 'n';
		msg[0][3]= 'd';
		
		
		msg[1][0]= 'n';
		msg[1][1]= 'u';
		msg[1][2]= 'd';
		msg[1][3]= 'e';
		msg[1][4]= 's';
		System.out.println(Arrays.toString(msg[0]));
		System.out.println(Arrays.toString(msg[1]));
		
		System.out.println(Arrays.deepToString(msg));

	}

}
