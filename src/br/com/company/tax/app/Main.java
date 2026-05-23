package br.com.company.tax.app;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import br.com.company.tax.entities.Company;
import br.com.company.tax.entities.Individual;
import br.com.company.tax.entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		ArrayList<TaxPayer> list = new ArrayList<>(); 
		
		Scanner ler = new Scanner(System.in); 
		double sum = 0.0; 
		
		System.out.print("Enter the number of tax payers: ");
		int n = ler.nextInt(); 
		ler.nextLine();
		for(int i = 1; i <= n;i++) {
			System.out.printf("Tax payer #%d data:\n", i);
			System.out.print("Individual or company (i/c)? ");
			Character op = Character.toLowerCase(ler.nextLine().charAt(0)); 
			System.out.print("Name: ");
			String name = ler.nextLine(); 
			System.out.print("Anual income: ");
			double anualIncome = ler.nextDouble(); 			
			switch(op) {
				case 'i': 
					System.out.print("Health expenditures: ");
					double healthExpenditures = ler.nextDouble();
					ler.nextLine();
					list.add(new Individual(name,anualIncome,healthExpenditures));
					break; 
				case 'c': 
					System.out.print("Number of employees: ");
					int numberOfEmployees = ler.nextInt();
					ler.nextLine();
					list.add(new Company(name,anualIncome, numberOfEmployees));
					break;
			}
		}
		System.out.println("\nTAXES PAID: ");
		for (TaxPayer t : list) {
			System.out.println(t);
		}
		
		for (TaxPayer t : list) {
			sum += t.tax(); 
		}
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
		ler.close();
	}
}
