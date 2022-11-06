package kodlama.io.rentACar.entities.concretes;

public class Brand {
	private String name;
	private int id;
	public Brand(int i, String string) {
		
	}
	public Brand(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
