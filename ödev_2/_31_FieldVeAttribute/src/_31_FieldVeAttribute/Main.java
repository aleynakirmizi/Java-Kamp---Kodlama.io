package _31_FieldVeAttribute;

public class Main {
	//32.,33.ve 34. dersi de kapsamaktadýr.
	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","DELL Laptop",5000,4,"siyah");
		//product.setName("Laptop");
		//product.setDescription("DELL Laptop");
		//product.setPrice(5000);
		//product.setUnitStock(4);
		//System.out.println(product.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}

}
