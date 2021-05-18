package cts.pacuraru.diana.g1094.pattern.factory;


public class BankAccountFactory {
	
	public static BankAccount getAccount(AccountType accountType) {
		
		BankAccount bankAccount = null;
		
		switch(accountType) {
		case DEBIT:
			bankAccount= new DebitAccount(1000, "01", false, false);
			break;
		case CREDIT:
			bankAccount=new CreditAccount(2000, "02", 0, 0);
			break;
			
			default:
				throw new UnsupportedOperationException("Type not covered");
		}
		
		return bankAccount;
	}

}
