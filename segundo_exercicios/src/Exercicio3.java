import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite Dois Número!");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if ( 0 == A % B || 0 == B % A ) {
			System.out.println("São Multíplos!");
		}
		else {
			System.out.println("Não São Multíplos!");
		}
		
		
		sc.close();
	}	
}
