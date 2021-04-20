package ro.ase.acs.cts.g1094.homework.codereview;

public class NegativeLoanValueException extends RuntimeException {
	
	public NegativeLoanValueException() {
		super("Loan value cannot be negative");
	}

}
