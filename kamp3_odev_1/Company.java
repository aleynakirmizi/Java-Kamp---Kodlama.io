package kamp3_odev_1;

public class Company extends Customer {
	private String TaxNumber;
	private String companyName;
	public String getTaxNumber() {
		return TaxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
