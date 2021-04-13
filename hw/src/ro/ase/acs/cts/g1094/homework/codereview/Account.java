package ro.ase.acs.cts.g1094.homework.codereview;

public class Account {
	public double	loanValue,rate;	
	public int	daysActive,accountType;
	public static final int	STANDARD=0,BUDGET=1,PREMIUM=2,SUPER_PREMIUM=3;
	
	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}
	
	public double getRate() {
		System.out.println("The rate is "+ this.rate);
		return this.rate;
	}
	
	public double getMonthlyRate() {
		return loanValue*rate;
	}
	
	public void setValue(double value) throws UnsupportedOperationException {
		if(value<0)
		{
			throw new UnsupportedOperationException("Value is negative");
			}
		else
		{
			loanValue = value;
		}
	}
	
	public String printAccountInfo() {
		return "Loan: " + this.loanValue+"; rate: " + this.rate + "; days active:" + daysActive + "; Type: " + accountType + ";";
	}
	

	public static double calculateTotalFee(Account[] 	accounts)
	{
	double totalFee=0.0;
	Account	account;
	var temp = 365;
	for	(int	i=0;i<accounts.length;i++)	{
	account=accounts[i];
	if(account.accountType==Account.PREMIUM||account.accountType==Account.SUPER_PREMIUM)	
	totalFee+=.0125	*	(
			account.loanValue*Math.pow(account.rate,(account.daysActive/365)) - account.loanValue);
	
	else 
	{
		totalFee=0;
	}}
	return	totalFee;
	}

	public Account(double value, double rate, int account_Type) throws UnsupportedOperationException {
		if(value<0) {
			throw new UnsupportedOperationException("Value is negative");
		}			
		
		else
		{
			loanValue = value;
		}
		this.rate = rate;
		this.accountType = account_Type;
	}
	
	
}