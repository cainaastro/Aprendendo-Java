import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, pi, raio, r2;
		pi = 3.14159;
		
		System.out.println("Me dê um valor do raio e eu lhe darei a área do círculo!");
		raio = sc.nextDouble();
		r2 = Math.pow(raio, 2);
		area = pi * r2;
		System.out.printf("A ÁREA DO CÍRCULO É: %.4f%n", area);
		
		sc.close();
	}
	
}
