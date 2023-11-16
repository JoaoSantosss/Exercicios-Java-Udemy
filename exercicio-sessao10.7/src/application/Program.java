package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		while (n > 10) {
			System.out.print("How many rooms will be rented?");
			n = sc.nextInt();
		}
		
		Rooms[] rooms = new Rooms[10];
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Rent #%d:\n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			rooms[room] = new Rooms(name, email);
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.printf("%d: ", i);
				System.out.println(rooms[i]);
			}
		}
	
		sc.close();
		
	}

}
