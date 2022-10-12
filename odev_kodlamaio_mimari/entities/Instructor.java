package odev_kodlamaio_mimari.entities;

public class Instructor {
	private String id;
	private String firstName;
	private String lastName;
	private String[] courses;
	private String givenCourseId;
	
	public Instructor() {
	}
	public Instructor(String id, String firstName, String lastName, String[] courses, String givenCourseId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = courses;
		this.givenCourseId = givenCourseId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String getGivenCourseId() {
		return givenCourseId;
	}
	public void setGivenCourseId(String givenCourseId) {
		this.givenCourseId = givenCourseId;
	}
	
	
	
	
}
