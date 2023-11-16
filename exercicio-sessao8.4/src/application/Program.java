package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Ask for dollar price
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		//Ask for how many dollars the person will buy
		System.out.println("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
		
		//Show the amount to be paid in reais 
		double ReaisToDollar = CurrencyConverter.convertRealToDollar(dollarPrice, dollarBought);
		System.out.printf("Amount to be paid in reais = %.2f", ReaisToDollar);
		
		sc.close();

	}

}
