package application;

import java.util.Locale;
import java.util.Scanner;

import util.RoomsData;

public class MainRegister {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RoomsData[] room = new RoomsData[9];
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for (int i=1; i <= n; i++){
			System.out.printf("Rent #%d%n", i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int idRoom = sc.nextInt();
			sc.nextLine();
			room[idRoom] = new RoomsData(name, email, idRoom);
			System.out.println();
		}
			
		System.out.println("Busy rooms: ");
		for (int i=0; i < room.length; i++) {
			if (room[i] != null) {
				System.out.printf("%d: %s, %s%n", room[i].getIdRoom(), room[i].getName(), room[i].getEmail());
			}
		}		
		
		sc.close();		
	}

}
