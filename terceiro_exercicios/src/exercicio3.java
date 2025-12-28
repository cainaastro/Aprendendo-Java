import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = 0, G = 0, D = 0, C; // 1.Alcool 2.Gasolina 3.Diesel 4.Fim
		
		C = sc.nextInt();
		
		while ( C != 4) {
			if ( C == 1 ) {
				A = A + 1;
				C = sc.nextInt();
			}
			else if ( C == 2 ) {
				G = G + 1;
				C = sc.nextInt();
			}
			else if ( C == 3 ) {
				D = D + 1;
				C = sc.nextInt();
			}
			else {
				System.out.println("CODÍGO INVALIDO");
				C = sc.nextInt();
			}
			
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Álcool: " + A);
		System.out.println("Gasolina: " + G);
		System.out.println("Diesel: " + D);
		
		sc.close();
	}			
}
