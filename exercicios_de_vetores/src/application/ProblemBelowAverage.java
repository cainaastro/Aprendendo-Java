package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemBelowAverage {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		System.out.print("How many elements will be in vector? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		double avg=0.0;
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextDouble();
			avg += vect[i];
		}
		System.out.println();
		avg = avg / vect.length;
		System.out.printf("VECTOR AVERAGE = %.3f%n", avg);
		
		System.out.println("ELEMENTS BELOW THE AVERAGE: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();
	}

}
