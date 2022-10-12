package odev_kodlamaio_mimari.entities;

public class Course {
	private String courseId;
	private String courseName;
	private String description;
	private String[] instructors;
	private int price;
	
	public Course() {
	}
	public Course(String courseId, String courseName, String description, String[] instructors, int price) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.description = description;
		this.instructors = instructors;
		this.price = price;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getInstructors() {
		return instructors;
	}
	public void setInstructors(String[] instructors) {
		this.instructors = instructors;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
