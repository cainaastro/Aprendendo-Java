import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long x;
		
		System.out.println("Digite um Número!");
		x = sc.nextLong();
		
		if ( 0 == x % 2 ) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}
}
