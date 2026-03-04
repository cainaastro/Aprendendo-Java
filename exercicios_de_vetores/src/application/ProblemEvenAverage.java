package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemEvenAverage {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		System.out.print("How many elements will be in vector? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		double avg=0.0;
		int ceven = 0;
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextDouble();
			if (vect[i] % 2 == 0) {
				avg += vect[i];
				ceven++;
			}
		}
		
		if (avg > 0) {
			avg = avg / ceven;
			System.out.println("EVEN AVERAGE = " + avg);
		}
		else {
			System.out.println("NO ONE EVEN NUMBER");
		}
		
		
		sc.close();
	}

}
