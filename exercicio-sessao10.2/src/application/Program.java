package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		
		Numbers[] numbers = new Numbers[n];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero:");
			double num = sc.nextDouble();
			numbers[i] = new Numbers(num);
		}
		
		double sum = 0; 
			
			System.out.print("VALORES = ");
			for (int i = 0; i < numbers.length; i++) {
				
				System.out.printf("%.2f ", numbers[i].getNum());
				sum += numbers[i].getNum();
			}
		double average = sum / numbers.length;
		System.out.printf("\nSOMA = %.2f\n", sum);
		System.out.printf("MEDIA = %.2f\n", average);
				
		sc.close();

	}

}
