package br.com.company.tax.entities;

public class Company extends TaxPayer{
	
	private int NumberOfEmployees;
	
	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		NumberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		return (NumberOfEmployees < 10) ? (AnualIncome * 0.16) : (AnualIncome * 0.14);
	} 
}
