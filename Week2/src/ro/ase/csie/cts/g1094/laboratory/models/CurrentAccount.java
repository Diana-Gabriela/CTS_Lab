package ro.ase.csie.cts.g1094.laboratory.models;

import ro.ase.csie.cts.g1094.laboratory.exceptions.IllegalTranferException;
import ro.ase.csie.cts.g1094.laboratory.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {

	public static final double MAX_CREDIt=5000;
	
	 public CurrentAccount(String iban) {
		super(iban, CurrentAccount.MAX_CREDIt);
	}
	
	@Override
	public void deposit(Double amount) {
		this.balance+=amount;

	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsException{
		if(amount > this.balance)
		{
			throw new InsufficientFundsException("Not enough money in account");
		}
		else {
		this.balance-=amount;
		}


	}

	@Override
	public void transfer(Account destination, Double amount) throws InsufficientFundsException,IllegalTranferException {
		if(this == destination) {
			throw new IllegalTranferException();
		}
		
		this.withdraw(amount);
		destination.deposit(amount);

	}

}
