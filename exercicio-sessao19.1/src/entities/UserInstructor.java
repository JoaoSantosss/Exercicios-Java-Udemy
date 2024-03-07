package entities;

import java.util.ArrayList;
import java.util.List;

public class UserInstructor {
	
	private String username;
	
	List<Course> courses = new ArrayList<>();
	
	public UserInstructor() {
	}

	public UserInstructor(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Course> getCourses() {
		return courses;
	}
	
	public Course getCourse(int index) {
		if (index >= 0 && index < courses.size()) {
			return courses.get(index);
		}
		else {
			return null;
		}
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
	}
	
}
