package entities;

public class Student {
	
	public String name;
	public double firstSemester;
	public double secondSemester;
	public double thirdSemester;
	
	public double sumOfTheGrades() {
		
		return firstSemester + secondSemester + thirdSemester;
		
	}
	
	public void approvedOrNot() {
		
		if(sumOfTheGrades() >= 60) {
			System.out.printf("FINAL GRADE = %.2f\n", sumOfTheGrades());
			 System.out.println("PASS");
		}
		else if (sumOfTheGrades() < 60) {
			System.out.printf("FINAL GRADE = %.2f\n", sumOfTheGrades());
			 System.out.printf("FAILED\nMISSING %.2f POINTS", 60 - sumOfTheGrades());
		}
		
	}
	
}
