package cts.pacuraru.diana.g1094.pattern.proxy;

public class TrasnsactionProcessor implements IVisaProcessor {

	String transactionID;
	static double exchangeRate = 4.9;
	
	

	public TrasnsactionProcessor(String transactionID) {
		super();
		this.transactionID = transactionID;
	}

	@Override
	public void transaction(String sourseAccount, String destinationAccount, double value, String currency) {

		System.out.println("Deposited  " + value + " " + currency + " from " 
		+ sourseAccount + " to " + destinationAccount);
		
	}

	@Override
	public void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount, double value,
			String sourseCurrency, String destinationCurrency) {
		
		value = value * exchangeRate;

		System.out.println("Deposited  " + value + " " + sourseCurrency + 
				" from " + sourseAccount + " to " + destinationAccount + " in " + destinationCurrency + " - I am done by the initial Visa/Mastercad");
		
	}

}
