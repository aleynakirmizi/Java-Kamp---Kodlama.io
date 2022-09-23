package _31_FieldVeAttribute;

public class Product {
	private int id;
	private String name;
	private String description;
	private double price;
	private int unitStock;
	private String renk;
	
	public Product() {
		System.out.println("Yapýcý blok çalýþtý.");
	}

	public Product(int id, String name, String description, double price, int unitStock, String renk) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.unitStock = unitStock;
		this.renk = renk;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnitStock() {
		return unitStock;
	}

	public void setUnitStock(int unitStock) {
		this.unitStock = unitStock;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

}
