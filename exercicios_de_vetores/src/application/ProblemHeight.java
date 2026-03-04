package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Peoples;

public class ProblemHeight {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantas pessoas serão registradas? ");
		n = sc.nextInt();
		sc.nextLine();
		Peoples[] vect = new Peoples[n];
		
		int c = 0;
		for (int i=0; i<vect.length; i++) {
			c++;
			System.out.printf("Dados da %dº pessoa: %n", c);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Peoples(name, age, height);
		}

		double avgHeight = 0.0;
		for (int i=0; i<vect.length; i++) {
			avgHeight += vect[i].getHeight();
		}
		double percentAge = 0;
		for (int i=0; i<n; i++) {
			if ( vect[i].age < 16) {
				percentAge += 1;
			}
		}
		
		avgHeight = avgHeight / vect.length;
		percentAge = (percentAge / vect.length) * 100;
		
		System.out.printf("Altura média: %.2f%n", avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f", percentAge);
		System.out.println("%");
		for (int i=0; i<n; i++) {
			if (vect[i].age < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
