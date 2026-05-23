package br.com.company.tax.entities;

public abstract class TaxPayer {
	
	protected String Name; 
	protected double AnualIncome;
	
	public TaxPayer(String name, double anualIncome) {
		Name = name;
		AnualIncome = anualIncome;
	} 
	
	public abstract double tax();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(Name + ": $ " + String.format("%.2f", tax())); 
		
		return sb.toString();
	}
	
	
}
