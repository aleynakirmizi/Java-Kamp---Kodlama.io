package odev_kodlamaio_mimari.UI;

import odev_kodlamaio_mimari.business.CategoryManager;
import odev_kodlamaio_mimari.business.CourseManager;
import odev_kodlamaio_mimari.business.InstructorManager;
import odev_kodlamaio_mimari.core.logging.DatabaseLogger;
import odev_kodlamaio_mimari.core.logging.EMailLogger;
import odev_kodlamaio_mimari.core.logging.FileLogger;
import odev_kodlamaio_mimari.core.logging.Logger;
import odev_kodlamaio_mimari.dataAccess.HibernateDao;
import odev_kodlamaio_mimari.dataAccess.JDBCDao;
import odev_kodlamaio_mimari.entities.Category;
import odev_kodlamaio_mimari.entities.Course;
import odev_kodlamaio_mimari.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ins1 = {"Engin Demiroð"};
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new EMailLogger()};
		Course course = new Course("1","Yazýlým Geliþtirici Yetiþtirme Kampý","Java programlama diline yeni baþlayanlar için",ins1,10) ;
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
		Course course1 = new Course("2","Yazýlým Geliþtirici Yetiþtirme Kampý","Java programlama diline yeni baþlayanlar için",ins1,10) ;
		Category category = new Category("1","Programlama");
		Category cat1 = new Category("2","Programlama");
		String[] courses = {"SQL"};
		Instructor ins = new Instructor("1", "Engin", "Demiroð",courses , "1");
		InstructorManager instructorManager = new InstructorManager(new HibernateDao(),loggers);
		CategoryManager categoryManager = new CategoryManager(new JDBCDao(), loggers);
		
		try {
			instructorManager.add(ins);
			courseManager.add(course);
			categoryManager.add(category);
			categoryManager.add(cat1);
			courseManager.add(course1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
