package kamp3_odev_1;

public class CustomerManager {
	private Customer customer;
	private ICreditManager IcreditManager;
	
	public CustomerManager(Customer customer, ICreditManager IcreditManager) {
		this.customer = customer;
		this.IcreditManager = IcreditManager;
	}
	public void Save() {
		System.out.println("kaydedildi: ");
	}
	public void Delete() {
		System.out.println("Müþteri silindi: ");
	}
	
	public void giveCredit() {
		IcreditManager.Calculate();
		System.err.println("Kredi Verildi");
	}
}
