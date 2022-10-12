package odev_kodlamaio_mimari.business;

import java.util.LinkedList;

import odev_kodlamaio_mimari.core.logging.Logger;
import odev_kodlamaio_mimari.dataAccess.BaseDao;
import odev_kodlamaio_mimari.entities.Category;

public class CategoryManager {
	private BaseDao dao;
	private Logger[] loggers;
	
	LinkedList<Category>categories = new LinkedList<Category>();
	public CategoryManager(BaseDao dao, Logger[] loggers) {
		this.dao = dao;
		this.loggers = loggers;
	}
	
	public void add(Category newcategory) throws Exception {
		if(checkIfCategoryExist(newcategory.getCategoryName())) {
			throw new Exception("The Category Already Exists");
		}else
			
			for (Logger logger : loggers) {
				logger.logging(newcategory.getCategoryName());
			}
			categories.add(newcategory);
			dao.addCategory(newcategory);
	}
	
	
	public boolean checkIfCategoryExist(String name) {
		for (Category category : categories) {
			if (category.getCategoryName().toLowerCase().equals(name.toLowerCase())) {
				return true;
			}
		}return false;
		
	}

}
