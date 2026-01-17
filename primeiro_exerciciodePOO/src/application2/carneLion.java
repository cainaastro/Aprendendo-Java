package application2;

import java.util.Locale;
import java.util.Scanner;

import entities2.Information;

public class carneLion {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Information data = new Information();
		
		System.out.println("Enter your information: ");
		System.out.print("Name: ");
		data.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		data.gSalary = sc.nextDouble();
		System.out.print("Tax: ");
		data.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employeer: %s, $ %.2f%n", data.name, data.tSalary() );
		
		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		double quantity = sc.nextDouble();
		
		System.out.printf("Update data: %s, $ %.2f%n", data.name, data.iSalary(quantity) );
		
		
		sc.close();
	}
}
