package odev_kodlamaio_mimari.dataAccess;

import odev_kodlamaio_mimari.entities.Category;
import odev_kodlamaio_mimari.entities.Course;
import odev_kodlamaio_mimari.entities.Instructor;

public class JDBCDao implements BaseDao{

	@Override
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		System.out.println(category.getCategoryName()+" Added by JDBC");
	}

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		System.out.println(course.getCourseName()+" Added by JDBC");
	}

	@Override
	public void addInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" Added by JDBC");
	}

	

}
