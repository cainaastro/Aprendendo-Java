import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("digite um número!");
		x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("NÃO NEGATIVO");	
			
		}
		else if ( x < 0 ) {
			System.out.println("NEGATIVO");
				
		}	
		else {
			System.out.println("NEUTRO");
		}
		
		sc.close();
		
	}

}
