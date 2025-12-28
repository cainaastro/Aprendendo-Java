import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("DIGITE AS COORDENADAS X E Y:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while ( x != 0 && y != 0 ) {
			if ( x > 0 && y > 0) {
				System.out.println("Primeiro");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}
			else if ( x < 0 && y > 0) {
				System.out.println("Segundo");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}	
			else if ( x < 0 && y < 0) {
				System.out.println("Terceiro");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}
			else {
				System.out.println("Quarto");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}
		}
		
		sc.close();
	}
}
