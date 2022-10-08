package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product p1 = new Product(1,"IPhon Xr",10000);
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		ProductManager productManager = new ProductManager(new jdbcProductDao(),loggers);
		productManager.add(p1);
	}
	
}
