package cts.pacuraru.diana.g1094.pattern.proxy;

public class TransactionProcessorWIthOwnExchangeRate implements IVisaProcessor {

	IVisaProcessor transactionModule = null; 
	static double ownExchangeRate = 2;
	
	
	public TransactionProcessorWIthOwnExchangeRate(IVisaProcessor transactionModule) {
		super();
		this.transactionModule = transactionModule;
	}

	@Override
	public void transaction(String sourseAccount, String destinationAccount, double value, String currency) {


		transactionModule.transaction(sourseAccount, destinationAccount, value, currency);

	}

	@Override
	public void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount, double value,
			String sourseCurrency, String destinationCurrency) {

		value = value * ownExchangeRate;

		transactionModule.transactionWithCurrencyExchange(sourseAccount, destinationAccount, value, sourseCurrency, destinationCurrency);
	}

}
