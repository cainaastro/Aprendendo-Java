package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemEvenNumber {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("How many numbers y'll type? ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0; i < vect.length; i++) {
			System.out.print("type a number: ");
			vect[i] = sc.nextInt(); 
		}
		
		System.out.println();
		System.out.println("EVEN NUMBERS: ");
		int countEven=0;
		
		for (int i=0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				countEven += 1;
			}	
		}
		System.out.println();
		System.out.println();
		System.out.println("EVEN NUMBERS QUANTITY: " + countEven);
		
		sc.close();
	}

}
