import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, H;

		
		System.out.println("Qual foi a hora inicial e a hora que terminou?");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A > B) {
			H = 24 - A + B;	
		}
		else if ( A < B ) {
			H = B - A;	
		}
		else {
			H = 24;
		}
		
		
		System.out.println("O JOGO DUROU " + H + " HORAS(S)!");
		
		sc.close();
	}
	
}
