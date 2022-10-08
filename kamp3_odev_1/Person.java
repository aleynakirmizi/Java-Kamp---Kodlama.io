package kamp3_odev_1;

public class Person extends Customer {
	private String  NationalId;
	private String firstName;
	private String lastName;

	public String getNationalId() {
		return NationalId;
	}
	public void setNationalId(String nationalId) {
		this.NationalId = nationalId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
