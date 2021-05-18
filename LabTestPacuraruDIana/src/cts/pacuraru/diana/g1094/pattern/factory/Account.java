package cts.pacuraru.diana.g1094.pattern.factory;

public class Account {
	
	
	String clientName;
	
	BankAccount bankAccount;


	
	public Account(String clientName, BankAccount bankAccount) {
		super();
		this.clientName = clientName;
		this.bankAccount = bankAccount;
	}



	public void setAccount(BankAccount account) {
		this.bankAccount = account;
	}

}
