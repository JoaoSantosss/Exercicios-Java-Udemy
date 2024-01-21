package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.LegalPerson;
import entities.Taxpayers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Taxpayers> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpendings = sc.nextDouble();
				
				list.add(new Individual(name, annualIncome, healthSpendings));
			}
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				
				list.add(new LegalPerson(name, annualIncome, employees));
			}
		}
		
		System.out.println();
		double totalTaxes = 0;
		System.out.println("TAXES PAID:");
		for (Taxpayers tx : list) {
			System.out.println(tx.getName() 
								+ ": $ " + String.format("%.2f", tx.tax()));
			
			totalTaxes += tx.tax();
		}
		System.out.println("TOTAL TAXES: $ " 
							+ String.format("%.2f", totalTaxes));
		
		sc.close();
	}

}
