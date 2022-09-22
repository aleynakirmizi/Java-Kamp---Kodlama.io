package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Vade Oran�";
		
		Product kahveMakinas� = new Product();
		kahveMakinas�.setName("Ar�elik telve kahve makinesi");
		kahveMakinas�.setDiscount(7);
		kahveMakinas�.setUnitPrice(5000);
		kahveMakinas�.setUnitsInStock(3);
		kahveMakinas�.setImageUrl("ar�elik1.jpg");
		
		Product p2 = new Product();
		
		p2.setName("Smeg kahve makinesi");
		p2.setDiscount(7);
		p2.setUnitPrice(7000);
		p2.setUnitsInStock(3);
		p2.setImageUrl("smeg1.jpg");
		
		Product p3 = new Product();
		
		p3.setName("Kitchen aid kahve makinesi");
		p3.setDiscount(7);
		p3.setUnitPrice(7000);
		p3.setUnitsInStock(3);
		p3.setImageUrl("kitchen.jpg");
		
		
		
		Product[] products = {kahveMakinas�,p2};
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}		System.out.println("</ul>");
		
		
		IndividualCustomer ind1 = new IndividualCustomer();
		ind1.setCustomerNumber("12345");
		ind1.setId(1);
		ind1.setPhone("050505050505");
		ind1.setFirstName("Aleyna");
		ind1.setLastName("K�rm�z�");
		
		CoorporateCustomer c1 = new CoorporateCustomer();
		c1.setId(2);
		c1.setCompanyName("Kodlama.io");
		c1.setPhone("053333333333");
		c1.setCustomerNumber("54321");
		c1.setTaxNumber("1111111111");
		
		Customer[] customers = {ind1,c1};
		
		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}
	}

}
