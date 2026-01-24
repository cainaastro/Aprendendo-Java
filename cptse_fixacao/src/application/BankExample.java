package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DataBank;

public class BankExample {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numberAcc = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account name: ");
		String holderAcc = sc.nextLine();
		DataBank databank = new DataBank(numberAcc, holderAcc);
		
		System.out.print("is there an initial deposit? [y/n] ");
		String answer = sc.next();
		double depositAcc;
		if (answer.charAt(0) == 'y') {
			System.out.print("Enter a initial value deposit: ");
			depositAcc = sc.nextDouble();
			databank.addDepositAcc(depositAcc);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(databank.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		depositAcc = sc.nextDouble();
		databank.addDepositAcc(depositAcc);
		
		System.out.println("Account data:");
		System.out.println(databank.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawAcc = sc.nextDouble();
		databank.removeDepositAcc(withdrawAcc);
		
		System.out.println("Account data:");
		System.out.println(databank.toString());
		
		sc.close();
	}
}
