import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double P1 = 4.00, P2 = 4.50, P3 = 5.00, P4 = 2.00, P5 = 1.50, V; 
		int x, y;
		
		System.out.println("CÓDIGO      PRODUTO       PREÇO");
		System.out.println("  1     Cachorro Quente   R$ 4,00");
		System.out.println("  2        X-Salada       R$ 4,50");
		System.out.println("  3        X-Bacon        R$ 5,00");
		System.out.println("  4     Torrada Simples   R$ 2,00");
		System.out.println("  5       Refrigerante    R$ 1,50");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if ( x == 1 ) {
			V = P1 * y;
		}
		else if ( x == 2 ) {
				V = P2 * y;
		}
		else if ( x == 3 ) {
				V = P3 * y;
		}
		else if ( x == 4 ) {
				V = P4 * y;
		}		
		else {
			V = P5 * y;
		}
		
		System.out.printf("Total: R$ %.2f%n ", V);
		
		sc.close();
	}
}
