package application;

import java.util.Locale;
import java.util.Scanner;

import entities.OlderPeople;

public class ProblemOlder {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		System.out.print("How many peoples y'll type? ");
		n = sc.nextInt();
		
		OlderPeople[] vect = new OlderPeople[n];
		
		int c = 1;
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println(c + "º Person Register:");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			vect[i] = new OlderPeople(name, age);
			c++;
		}
		
		String older = null;
		int oldage = 0;
		for (int i=0; i <vect.length; i++) {
			if (vect[i].age > oldage) {
				oldage = vect[i].getAge();
				older = vect[i].getName();
			}
		}
		System.out.println("THE OLDEST PERSON: " + older);
		
		sc.close();
	}

}
