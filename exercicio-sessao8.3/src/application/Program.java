package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		student.firstSemester = sc.nextDouble();
		student.secondSemester = sc.nextDouble();
		student.thirdSemester = sc.nextDouble();
		
		student.approvedOrNot();
		
		sc.close();

	}

}
