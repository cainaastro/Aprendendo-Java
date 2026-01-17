package application3;

import java.util.Locale;
import java.util.Scanner;

import entities3.Calculator;

public class school {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator data = new Calculator();
		
		data.name = sc.nextLine();
		data.s1 = sc.nextDouble();
		data.s2 = sc.nextDouble();
		data.s3 = sc.nextDouble();
		
		System.out.print("FINAL GRADE: ");
		System.out.printf("%.2f%n", data.total());
		
		if (data.total() >= 60 ) {
			System.out.println("YOU PASSED");
			
		}
		else {
			System.out.println("YOU FAILED");
			System.out.printf("MISSING %.2f POINTS", (60 - data.total()) );
		}
		
		sc.close();
	}
}
