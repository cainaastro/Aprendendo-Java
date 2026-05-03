package application;

import java.util.Locale;
import java.util.Scanner;

import util.ProductData;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=========== OLÁ, SEJA BEM VINDO ===========");
		System.out.println("Gostaria de entrar no estoque Pneus Brasil?");
		System.out.println();
		System.out.println("Caso a resposta seja SIM, digite (1)");
		System.out.println("Caso a resposta seja NÃO, digite (2)");
		int respDeEntrada = sc.nextInt();
		
		if (respDeEntrada == 1 ) {
			System.out.println("Lista de Produtos Catalogados: ");
			System.out.println("Quantos Produtos será adicionados?");
			int nItem = sc.nextInt();
			System.out.println();
			ProductData[] data = new ProductData[nItem];
			for (int i=0; i < data.length; i++) {
				sc.nextLine();
				System.out.print("Nome do Produto: ");
				String name = sc.nextLine();
				System.out.print("Preço do Produto: R$ ");
				double price = sc.nextDouble();
				System.out.print("Quantidade: ");
				int quantity = sc.nextInt();
				System.out.print("Código do Produto: ");
				int codeBar = sc.nextInt();
				System.out.println();
				
				data[i] = new ProductData(name,price, quantity, codeBar);	
			}
			System.out.println("=========== LISTA DE PRODUTOS ==========");
			for (int i=0; i < data.length;i++) {
				System.out.println("Nome: " + data[i].getName());
				System.out.printf("Preço: R$ %.2f%n", data[i].getPrice());
				System.out.println("Quantidade: " + data[i].getQuantity());
				System.out.println("Código: " + data[i].getCodeBar());
				System.out.println();
			}
		}
		else {
			System.out.println("VOLTE SEMPRE!");
		}
		
		
		sc.close();
	}

}
