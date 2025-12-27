import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double s, i;
		System.out.println("Digite Seu Salário");
		s = sc.nextDouble();
		
		if ( s <= 2000 ){
			i = 0.0;
		}
		else if ( s <= 3000 ) {
			i = (s - 2000.0) * 0.08;
		}			
		else if ( s <= 4500 ) {	
			i = (s - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			i = (s - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (i == 0) {
			System.out.println("ISENTO");	
		}
		else {
		System.out.printf("R$ %.2f%n", i);
		}
		
		sc.close();
	}	
}
