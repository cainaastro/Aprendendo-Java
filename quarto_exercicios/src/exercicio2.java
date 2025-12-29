import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Y, in = 0, out = 0;
		
		for (int X = 0 ; X < N; X = X + 1) {
			Y = sc.nextInt();
			if ( 10 <= Y && Y <= 20 ) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
