package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class ProblemApproved {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		Students[] student = new Students[n];
		
		int c =1;
		for (int i=0; i < student.length; i++) {
			System.out.println("Type the name, first grade and second grade of the " + c + "º student:");
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			sc.nextLine();
			student[i] = new Students(name, grade1, grade2);
			c++;
		}
		
		System.out.println("Approved Students:");
		for (int i=0; i < student.length; i++) {
			double sum = (student[i].getGrade1() + student[i].getGrade2())/2;
			if (sum >= 6) {
				System.out.println(student[i].getName());
			}
			else {		
			}
		}
		sc.close();
	}

}
