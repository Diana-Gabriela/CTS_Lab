package cts.pacuraru.diana.g1094.pattern.factory;

public class TestFactory {

	public static void main(String[] args) {


		Account account1 = new Account("Joe", BankAccountFactory.getAccount(AccountType.CREDIT));
		account1.setAccount(BankAccountFactory.getAccount(AccountType.DEBIT));
		
		Account account2 = new Account("Gabe", BankAccountFactory.getAccount(AccountType.CREDIT));
		account2.setAccount(BankAccountFactory.getAccount(AccountType.DEBIT));

		
		Account account3 = new Account("Jane", BankAccountFactory.getAccount(AccountType.DEBIT));
		account3.setAccount(BankAccountFactory.getAccount(AccountType.DEBIT));



	}

}
