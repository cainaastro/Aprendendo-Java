import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	 
		int nf;
		double ht, s, vh;
		
		System.out.println("Me diga seu número, suas horas trabalhadas e seu valor por hora!");
		nf = sc.nextInt();
		ht = sc.nextDouble();
		vh = sc.nextDouble();
		s = ht * vh;
		System.out.println("Número: " + nf);
		System.out.printf("Salário: R$ %.2f%n", s);
			
		sc.close();
	}
	
}
