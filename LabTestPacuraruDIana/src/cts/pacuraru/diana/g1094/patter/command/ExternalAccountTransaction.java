package cts.pacuraru.diana.g1094.patter.command;

public class ExternalAccountTransaction extends BankModule {

	@Override
	public void processTransaction(String sourseAccount, String destinationAccount, double value,
			String destinationBank) {


		System.out.println("External transaction of " + value) ;
	}

}
