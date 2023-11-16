package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		Numbers[] numbers = new Numbers[n];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Digite um numero:");
			int number = sc.nextInt();
			numbers[i] = new Numbers(number);
		}
		
		int evenNumbers = 0;
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i].getNumber()%2 == 0) {
				System.out.printf("%d  ",numbers[i].getNumber());
				evenNumbers++;
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + evenNumbers);
		
		
		sc.close();
	}

}
