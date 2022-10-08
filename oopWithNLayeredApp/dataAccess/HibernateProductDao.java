package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {	
		//sadece db eriþme kodlarý yazýlacak SQL 
		System.out.println("Hibernate ile veri tabanýna eklendi");
	}
	
}
