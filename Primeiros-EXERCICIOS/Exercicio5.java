import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int c1, c2, q1, q2;
		double v1, v2, p;
		
		System.out.println("digite o codigo, a quantidade e o preço, em duas linhas!");//não tem condição escrever um enunciado desses bixo.
		c1 = sc.nextInt();
		q1 = sc.nextInt();
		v1 = sc.nextDouble();
		c2 = sc.nextInt();
		q2 = sc.nextInt();
		v2 = sc.nextDouble();
		p = (v1 * q1) + (v2 * q2);
		System.out.printf("Valor a pagar: R$ %.2f%n", p);
		
		sc.close();
	}
	
}
