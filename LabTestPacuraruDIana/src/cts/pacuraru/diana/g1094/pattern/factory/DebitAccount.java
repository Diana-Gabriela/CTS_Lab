package cts.pacuraru.diana.g1094.pattern.factory;

public class DebitAccount  extends BankAccount{
	boolean isSalaryStoredInAccount;
	boolean isOverdraftOprionActive;
	
	public DebitAccount(double Balance, String Id, boolean isSalaryStoredInAccount, boolean isOverdraftOprionActive) {
		super(Balance, Id);
		this.isSalaryStoredInAccount = isSalaryStoredInAccount;
		this.isOverdraftOprionActive = isOverdraftOprionActive;
		System.out.println("This is a debit account. Salary stored: "
		+ isSalaryStoredInAccount + 
		"   Credit overdraft: " + isOverdraftOprionActive);
	}


	

}
