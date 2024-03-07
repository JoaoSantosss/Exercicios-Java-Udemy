package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
	
	private String name;
	
	Set<UserStudent> Students = new HashSet<>();
	
	public Course() {
	}
	
	public Course(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserStudent> getStudents() {
		return Students;
	}

	public void addStudent(UserStudent StudentNumber) {
		Students.add(StudentNumber);
	}
	
	public void removeStudent(UserStudent StudentNumber) {
		Students.remove(StudentNumber);
	}
	

}
