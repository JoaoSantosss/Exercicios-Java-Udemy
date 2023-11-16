package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f", employee.name, employee.netSalary());
		
		double increaseSalaryPercentage;
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		increaseSalaryPercentage = sc.nextDouble();
		employee.increaseSalary(increaseSalaryPercentage);
		
		//System.out.printf("Updated data: %s, $ ", employee.name);
		System.out.println(employee);
		
		sc.close();

	}

}
