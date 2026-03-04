package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PeoplesData;

public class ProblemDataPeoples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many peoples will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		PeoplesData[] data = new PeoplesData[n];
		
		int c=1;
		for (int i=0; i < data.length; i++) {
			System.out.print(c + "º Height: ");
			double height = sc.nextDouble();
			System.out.print(c + "º Gender: ");
			char gender = sc.next().charAt(0);
			data[i] = new PeoplesData(gender, height);
			c++;
		}
		
		double taller=0.0, smaller=data[0].height, average=0.0;
		int males=0;
		int female=0;
		
		for (int i=0; i <data.length; i++) {
			if (data[i].height >= taller) {
				taller = data[i].height;
				
			}
			if (data[i].height <= smaller) {
				smaller = data[i].height;
				
			}
			if (data[i].gender == 'F' ) {
				average += data[i].height;
				female++;
			}
			else {
				males++;
			}
		}
		
		average = average / female;
	
		System.out.printf("Smallest height: %.2f%n", smaller);
		System.out.printf("Tallest height: %.2f%n", taller);
		System.out.printf("Women's average height: %.2f%n", average);
		System.out.printf("Male's quantity: %d", males);
		
		
		sc.close();
	}

}
