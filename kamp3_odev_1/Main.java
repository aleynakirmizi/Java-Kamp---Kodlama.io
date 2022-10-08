package kamp3_odev_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		Customer customer = new Customer();
		CustomerManager customerManager = new CustomerManager(customer,new TeacherCreditManager());
		customer.setId(1);
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.setId(10);
		company.setTaxNumber("13456");
		company.setCompanyName("Arçelik");
		
		Person person = new Person();
		person.setFirstName("Aleyna");
		person.setNationalId("0");
		
		CustomerManager customerManager2 = new CustomerManager(person,new CarCreditManager());
		customerManager2.Save();
	}



}
