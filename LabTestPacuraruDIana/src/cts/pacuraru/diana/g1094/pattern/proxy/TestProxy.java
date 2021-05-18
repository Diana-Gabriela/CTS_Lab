package cts.pacuraru.diana.g1094.pattern.proxy;

public class TestProxy {

	public static void main(String[] args) {


		IVisaProcessor processorModule = new TrasnsactionProcessor("01");
		processorModule.transaction("221", "332", 1000, "ron");
		processorModule.transactionWithCurrencyExchange("222", "333", 10, "ron", "euro");
		
		
		processorModule = new TransactionProcessorWIthOwnExchangeRate(processorModule);
		processorModule.transaction("223", "334", 100, "ron");
		processorModule.transactionWithCurrencyExchange("225", "363", 10, "ron", "euro");
		
	}

}
