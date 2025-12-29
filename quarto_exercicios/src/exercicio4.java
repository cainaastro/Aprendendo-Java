import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double media;
		
		for (int i = 0; i < N; i = i +1) {
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			
			if ( v2 == 0) {
				System.out.println("Divisão Impossível");
			}
			else {
				media = v1 / v2;
				System.out.printf("%.1f%n", media);
			}
		}
			
			sc.close();
		
	}
}
