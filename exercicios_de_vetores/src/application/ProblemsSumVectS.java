package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemsSumVectS {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("How many numbers y'll type? ");
		n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		
		System.out.println("Type the values of vector A: ");
		for (int i=0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt(); 
		}
		
		System.out.println("Type the values of vector B: ");
		for (int i=0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt(); 
		}
		
		int[] vectC = new int[n];
		System.out.println("RESULTANT VECTORS: ");
		for (int i=0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}	
	
}	