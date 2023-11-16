package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeerUser;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//#1 employees register
		List<EmployeerUser> list = new ArrayList<>();
		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("Emplyoee #%d:\n", i + 1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			EmployeerUser emp = new EmployeerUser(id, name, salary);
			 
			
			list.add(emp);
		}
		
		//#2 Increase Salary
		System.out.print("Enter the employee id that will have salary increase:");
		int idSalary = sc.nextInt();
		//Integer pos = position(list, idSalary);
		
		EmployeerUser emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage:");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		//#3 Print the Information 
		System.out.println("List of employees:");
		for (EmployeerUser e : list) {
			System.out.println(e);
		}
				
		sc.close();

	}
	
	public static Integer position(List<EmployeerUser> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static Boolean hasId(List<EmployeerUser> list, int id)
	{
		EmployeerUser emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
