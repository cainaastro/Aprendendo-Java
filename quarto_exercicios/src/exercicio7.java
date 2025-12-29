import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1 ; i <= N; i = i + 1) {
			int p3 = (int) Math.pow(i, 3);
			int p2 = (int) Math.pow(i, 2);
			
			System.out.println(i + " " + p2 + " " + p3);
	
		}
	
		sc.close();	
	}
}
