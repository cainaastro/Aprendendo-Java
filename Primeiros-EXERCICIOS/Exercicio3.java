import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v1, v2, v3, v4, df;
		
		System.out.println("Me dê quatro valores e lhe darei a diferença de dois produtos!");// sei la como fala isso bixo.
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		v3 = sc.nextInt();
		v4 = sc.nextInt();
		df = (v1 * v2) - (v3 * v4);
		System.out.println("A DIFERENÇA É: " + df);
		
		sc.close();
	}
	
}
