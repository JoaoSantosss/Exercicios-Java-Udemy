package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		
		double[] number = new double[n];
		double max = Double.NEGATIVE_INFINITY;
		int numPosition = 0;
		for (int i = 0; i < number.length; i++) {
			System.out.print("Digite um numero: ");
			number[i] = sc.nextDouble();
			
			if (number [i] > max) {
				max = number[i];
				numPosition = i;
			}
		}
	
		System.out.println("MAIOR VALOR = " + max);
		System.out.printf("POSICAO DO MAIOR VALOR = " + numPosition);
		
		sc.close();
	}

}
