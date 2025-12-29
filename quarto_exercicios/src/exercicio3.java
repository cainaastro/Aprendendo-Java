import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double media;
		
		for (int i = 0; i < N; i = i +1) {
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();
			
			media = (v1 * 2 + v2 * 3 + v3 * 5) / (2 + 3 + 5);
			System.out.printf("%.1f%n", media);
		}
		
		
		
		sc.close();
	}
}
