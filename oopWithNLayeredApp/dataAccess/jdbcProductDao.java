package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//data access object. 
//jdbc:veritaban�na eri�im y�ntemlerinden biri
public class jdbcProductDao implements ProductDao  {
	public void add(Product product) {	
		//sadece db eri�me kodlar� yaz�lacak SQL 
		System.out.println("JDBC ile veri taban�na eklendi");
	}
	
		
	
	
}
