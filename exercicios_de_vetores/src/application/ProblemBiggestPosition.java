package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemBiggestPosition {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		System.out.print("How many numbers y'll type? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i < vect.length; i++) {
			System.out.print("type a number: ");
			vect[i] = sc.nextInt(); 
		}
		
		System.out.println();
		double bigNumber = 0.0;
		int position = 0;
		
		for (int i=0; i < vect.length; i++) {
			if (vect[i] > bigNumber) {
				bigNumber = vect[i];
				position += 1;
			}	
		}
		
		System.out.println("BIGGEST VALUE = " + bigNumber);
		System.out.println("BIGGEST VALUE POSITION = " + position );
		
		sc.close();
	}

}
