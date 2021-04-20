
public class Bank {
	
	private String name;
	private String address;
	private int currentAccountCounter;
	
	private static Bank singletonBank = new Bank();
	
	private Bank() {
		//this is singleton implementation, therefore private
		this.name = "My bank";
		this.address = "My address";
	}
	
	public Bank getSingletonBankInstance() {
		return singletonBank;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getCurrentAccountCounter() {
		return currentAccountCounter;
	}
	
	public BankAccount generateAccount(String accountType) throws UnsupportedOperationException {
		if (AccountTypes.DEBIT.toString().equals(accountType)) {
			return new DebitAccount();
		}
		else if (AccountTypes.CREDIT.toString().equals(accountType)) {
			return new CreditAccount();
		} else {
			throw new UnsupportedOperationException("Not an account type");
		}
		
	}
}
