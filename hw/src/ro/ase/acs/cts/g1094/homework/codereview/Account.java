package ro.ase.acs.cts.g1094.homework.codereview;

public class Account implements IAccount {
	
	private double	loanValue;
	private double rate;	
	private int	remainingActiveDays;
	private AccountTypes accountType;
	
	private static final double BROOKERS_FEEE = .0125;
	private static final int DAYS_OF_THE_YEAR = 365;

	public Account(final double loanValue,
				   final double rate,
				   final AccountTypes account_Type,
				   final int remainingActiveDays) throws NegativeLoanValueException {
		if (loanValue < 0) {
			throw new NegativeLoanValueException();
		}			
		else {
			this.loanValue = loanValue;
		}
		this.rate = rate;
		this.accountType = account_Type;
		this.remainingActiveDays = remainingActiveDays;
	}
	
	public double getLoanValue() {
		return this.loanValue;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public double getMonthlyRate() {
		return loanValue * rate;
	}
	
	public void setLoanValue(final double loanValue) throws NegativeLoanValueException {
		if (loanValue < 0) {
			throw new NegativeLoanValueException();
		}
		else {
			this.loanValue = loanValue;
		}
	}
	
	public String toString() {
		return "Loan: " + this.loanValue+"; rate: " + this.rate + "; days active:" + remainingActiveDays + "; Type: " + accountType + ";";
	}
	
	public double calculateAccountFee() {
		return BROOKERS_FEEE * (this.loanValue * Math.pow(this.rate, (this.remainingActiveDays/DAYS_OF_THE_YEAR)) - this.loanValue);
	}
	

	public static double calculateTotalFee(final Account[] accounts) {
	double totalFee = 0.0;
	Account	account;
	for	(int i = 0; i < accounts.length; i++) {
		account = accounts[i];
		if(account.accountType == AccountTypes.PREMIUM || account.accountType == AccountTypes.SUPER_PREMIUM) {
			totalFee += account.calculateAccountFee();
		}
	}
	return	totalFee;
	}
	
}