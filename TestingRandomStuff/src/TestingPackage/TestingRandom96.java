package TestingPackage;

public class TestingRandom96 {
	
	static int MAX = 100; 
	  
	// Fills a[m][n] with values from 1 to m*n in 
	// spiral fashion. 
	    static void spiralFill(int krajReda, int krajKolone, int a[][]) { 
	        // Initialize value to be filled in matrix 
	        int val = 1; 
	  
	        /*  k - starting row index 
	        m - ending row index 
	        l - starting column index 
	        n - ending column index */
	        int pocetakReda = 0, pocetakKolone = 0; 
	        while (pocetakReda < krajReda && pocetakKolone < krajKolone) { 
	            /* Print the first row from the remaining 
	          rows */
	            for (int i = pocetakKolone; i < krajKolone; ++i) { 
	                a[pocetakReda][i] = val++; 
	            } 
	  
	            pocetakReda++; 
	  
	            /* Print the last column from the remaining 
	          columns */
	            for (int i = pocetakReda; i < krajReda; ++i) { 
	                a[i][krajKolone - 1] = val++; 
	            } 
	            krajKolone--; 
	  
	            /* Print the last row from the remaining 
	           rows */
	     //       if (pocetakReda < krajReda) { 
	    //            for (int i = krajKolone - 1; i >= pocetakKolone; --i) { 
	     //               a[krajReda - 1][i] = val++; 
	      //          } 
	      //          krajReda--; 
	       //     } 
	  
	            /* Print the first column from the remaining 
	           columns */
	    //        if (pocetakKolone < krajKolone) { 
	     //           for (int i = krajReda - 1; i >= pocetakReda; --i) { 
	    //                a[i][pocetakKolone] = val++; 
	     //           } 
	      //          pocetakKolone++; 
	       //    } 
	        } 
	    } 
	  
	    /* Driver program to test above functions */
	    public static void main(String[] args) { 
	        int x = 5, y = 5; 
	        int a[][] = new int[MAX][MAX]; 
	        spiralFill(x, y, a); 
	        for (int i = 0; i < x; i++) { 
	            for (int j = 0; j < y; j++) { 
	                System.out.print(a[i][j] + " "); 
	            } 
	            System.out.println(""); 
	        } 
	    } 

}
