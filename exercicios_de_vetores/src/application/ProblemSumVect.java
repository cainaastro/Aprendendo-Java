package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemSumVect {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos números você irá digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i<vect.length; i++) {
			sum += vect[i];
		}
		
		double average = sum / n;
		
		System.out.print("VALORES: ");
		for (int i =0; i<n; i++) {
			System.out.printf("%.2f  ", vect[i]);
		}
		System.out.println();
		
		System.out.printf("SOMA: %.2f%n", sum);
		System.out.printf("MEDIA: %.2f%n", average);
		
		sc.close();
	}

}
