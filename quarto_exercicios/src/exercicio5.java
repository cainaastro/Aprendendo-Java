import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int fat = N;
		
		
		if ( N == 0) {
			System.out.println("1");	
		}
		
		for (int i = (N-1) ; i != 1; i = i - 1) {
				fat = fat * i;
		}
		
		
		System.out.println(fat);
		
		sc.close();
	}	
}
