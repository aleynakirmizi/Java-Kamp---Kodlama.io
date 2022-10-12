package odev_kodlamaio_mimari.dataAccess;

import odev_kodlamaio_mimari.entities.Category;
import odev_kodlamaio_mimari.entities.Course;
import odev_kodlamaio_mimari.entities.Instructor;

public interface BaseDao {
	void addCategory(Category category);
	void addCourse(Course course);
	void addInstructor(Instructor instructor);
	
	
}
