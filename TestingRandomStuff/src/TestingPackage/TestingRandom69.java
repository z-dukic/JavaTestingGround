package TestingPackage;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TestingRandom69 {

	public static void main(String[] args) { 
		
		
		String ime = "Pero Perić";
		String [] ImePrezime = ime.split(" ");
		System.out.println(Arrays.toString(ImePrezime));
		String email="";
		
		email = ImePrezime[0].substring(0).toLowerCase() + ImePrezime[1].toLowerCase();
		System.out.println(email + "@edunova.hr");
	}
}

