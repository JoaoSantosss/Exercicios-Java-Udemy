package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entities.UserInstructor;
import entities.UserStudent;

public class Program {

	public static void main(String[] args) {
		
		UserInstructor instructor = new UserInstructor("Allison");
		instructor.addCourse(new Course("A"));
		instructor.addCourse(new Course("B"));
		instructor.addCourse(new Course("C"));

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Set<UserStudent> totalSudents = new HashSet<>();
		for (int i = 0; i < instructor.getCourses().size(); i ++) {
			
			System.out.print("How many students for course " + instructor.getCourse(i).getName() + "? ");
			int n = sc.nextInt();
			
			for(int j = 0; j < n; j++) {
				int StudentNumber = sc.nextInt();
				instructor.getCourse(i).addStudent(new UserStudent(StudentNumber));
			}
			
			totalSudents.addAll(instructor.getCourse(i).getStudents());
			
		}
		
		System.out.println();
		System.out.println("Total students: " + totalSudents.size());
		
		sc.close();
		
		
	}

}
