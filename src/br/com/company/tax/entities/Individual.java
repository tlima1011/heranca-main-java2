package br.com.company.tax.entities;

public class Individual extends TaxPayer{
	
	private double HealthExpenditures;
	
	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		HealthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		return  (AnualIncome < 20000) ?  (AnualIncome * 0.15) - HealthExpenditures * 0.50 : (AnualIncome * 0.25) - HealthExpenditures * 0.50;
	}
}
