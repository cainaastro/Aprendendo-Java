import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v1, v2, r;
		
		System.out.println("Digite dois números e eu lhe darei a soma deles!");
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		r = v1 + v2;
		System.out.println("A Soma entre " + v1 + " e " + v2 + " é igual a " + r);
		
		sc.close();
	}
}
