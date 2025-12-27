import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.println("Digite um número");
		x = sc.nextDouble();
		
		if (0 < x && x <= 25) {
			System.out.println("Intervalo [0,25]");	
			
		}
		else if ( 25 < x && x <= 50 ) {
			System.out.println("Intervalo [25,50]");
				
		}	
		else if ( 50 < x && x <= 75 ) {
			System.out.println("Intervalo [50,75]");
		}
		else if ( 75 < x && x <= 100 ) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora do Intervalo!");
		}
		
		sc.close();
		
	}
}
