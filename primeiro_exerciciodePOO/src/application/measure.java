package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class measure {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect;
		rect = new Rectangle();
		
		System.out.println("Enter the measures of rectangle(Width and height): ");
		rect.x = sc.nextDouble();
		rect.y = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f", rect.diagonal());
		
		
		
		sc.close();
	}
}
