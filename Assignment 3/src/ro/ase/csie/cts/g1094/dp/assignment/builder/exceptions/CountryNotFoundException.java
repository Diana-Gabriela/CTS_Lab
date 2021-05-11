package ro.ase.csie.cts.g1094.dp.assignment.builder.exceptions;

public class CountryNotFoundException extends Exception {
	
	public CountryNotFoundException (String country) {
		
		super("The country " + country + " was not found in the list of available countries.");
	}

}
