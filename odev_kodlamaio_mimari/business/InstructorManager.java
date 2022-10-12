package odev_kodlamaio_mimari.business;

import odev_kodlamaio_mimari.core.logging.Logger;
import odev_kodlamaio_mimari.dataAccess.BaseDao;
import odev_kodlamaio_mimari.entities.Instructor;

public class InstructorManager {
	private BaseDao baseDao;
	private Logger[] loggers;
	
	
	
	public InstructorManager(BaseDao baseDao, Logger[] loggers) {
		super();
		this.baseDao = baseDao;
		this.loggers = loggers;
	}



	public void add(Instructor instructor){
		baseDao.addInstructor(instructor);
		for (Logger logger : loggers) {
			logger.logging(instructor.getFirstName()+" "+instructor.getLastName());
		}
	}
	

}
