import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi;
		double TG, CR, TP, QD, RT;
		
		pi = 3.14159;
		
		System.out.println("Me dê tres valores e verá a arte geométrica!");// na vrdd, é só os result memo KKKKKKKKKKK
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		TG = (A * C) / 2;
		CR = pi * (Math.pow(C, 2));
		TP = (A + B) * C / 2;
		QD = Math.pow(B, 2);
		RT = A * B;
		
		System.out.printf("TRIÂNGULO: %.3f%n", TG);
		System.out.printf("CÍRCULO: %.3f%n", CR);
		System.out.printf("TRAPÉZIO: %.3f%n", TP);
		System.out.printf("QUADRADO: %.3f%n", QD);
		System.out.printf("RETÂNGULO: %.3f%n", RT);
		
		sc.close();
	}
}
