package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {	
		//sadece db eri�me kodlar� yaz�lacak SQL 
		System.out.println("Hibernate ile veri taban�na eklendi");
	}
	
}
