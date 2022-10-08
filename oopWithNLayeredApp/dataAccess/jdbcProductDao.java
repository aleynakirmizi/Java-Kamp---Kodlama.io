package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//data access object. 
//jdbc:veritabanýna eriþim yöntemlerinden biri
public class jdbcProductDao implements ProductDao  {
	public void add(Product product) {	
		//sadece db eriþme kodlarý yazýlacak SQL 
		System.out.println("JDBC ile veri tabanýna eklendi");
	}
	
		
	
	
}
