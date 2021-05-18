package cts.pacuraru.diana.g1094.patter.command;

public class AsyncCommand extends BankModule{
	
	String sourceAccount;
	String destinationAccount;
	double amount;
	String nameOfDestinationBank;
	
	@Override
	
	public void processTransaction(String sourseAccount, String destinationAccount, double value,
			String destinationBank) {

		System.out.println("from " + sourseAccount + " to " + destinationAccount + "of" + value);
		
	}
	


	
		
	}


