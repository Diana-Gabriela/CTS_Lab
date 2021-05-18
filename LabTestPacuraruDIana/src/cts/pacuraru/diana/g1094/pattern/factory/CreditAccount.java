package cts.pacuraru.diana.g1094.pattern.factory;

public class CreditAccount extends BankAccount{

	int numberOfInstallments;
	double creditLimit;
	
	public CreditAccount(double Balance, String Id, int numberOfInstallments, double creditLimit) {
		super(Balance, Id);
		this.numberOfInstallments = numberOfInstallments;
		this.creditLimit = creditLimit;
		System.out.println("This is a credit account. Number of installments: " + numberOfInstallments 
				+ "   Credit limit: " + creditLimit);

	}
	
	

}
