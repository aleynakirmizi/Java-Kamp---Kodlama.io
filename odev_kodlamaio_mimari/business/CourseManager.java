package odev_kodlamaio_mimari.business;

import java.util.LinkedList;

import odev_kodlamaio_mimari.core.logging.Logger;
import odev_kodlamaio_mimari.dataAccess.BaseDao;
import odev_kodlamaio_mimari.entities.Course;

public class CourseManager {
	private BaseDao baseDao;
	private Logger[] loggers;
	public CourseManager(BaseDao baseDao, Logger[] loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
	}
	LinkedList<Course> courseslist = new LinkedList<Course>();
	public void add(Course newcourse) throws Exception {
		if (checkIfCourseNameExist(newcourse.getCourseName())){
			throw new Exception("THE COURSE ALREADY EXISTS");
		}if(checkPrice(newcourse.getPrice())) {
			throw new Exception("THE PRICE OF THE COURSE CAN NOT BE EQUAL OR LOWER THAN 0");
		}
		else {
			System.out.println(newcourse.getCourseName().toLowerCase());
			courseslist.add(newcourse);
			baseDao.addCourse(newcourse);
		}
		for (Logger log : loggers) {
			log.logging(newcourse.getCourseName());
		}
	
		
	}
	public boolean checkIfCourseNameExist(String name) {
		for (Course course : courseslist) {
			if(course.getCourseName().toLowerCase().equals(name.toLowerCase())) {
				return true;
			}
			
		} return false;
		
	}
	public boolean checkPrice(int price) {
		if (price<=0) {
			return true;
		}return false;
	}
	
	
	
}
