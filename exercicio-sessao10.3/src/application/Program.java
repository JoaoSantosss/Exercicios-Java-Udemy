package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		
		Person[] person = new Person[n];
		for (int i = 0; i < person.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			person[i] = new Person(name, age, height);
		}
		double sum = 0;
		for (int i = 0; i < person.length; i++) {
			sum += person[i].getHeigth();
		}
		double avg = sum / person.length;
		System.out.printf("Altura média: %.2f\n", avg);
		
		int minor = 0;
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				minor++;
			}
		}
		double minorPercent = minor * 100 / person.length;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", minorPercent) + "%");

		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}
		
		sc.close();
	}

}
