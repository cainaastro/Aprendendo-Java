import java.util.Locale;

public class PrimeiroExercíciodeFixação {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567; 
		// já coloquei todas as váriaveis, agora irei só escrever o código para dar a saída que o Prof. Nélio pediu!
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.println("Record: " + age + " years old, code = " + code + " and Gender: " + gender);
		System.out.println();
		System.out.printf("Measure with eight decimal points: %.8f%n", measure);
		System.out.printf("Rounded (three decimal points): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		//vai tomando, consegui!
	}
}
