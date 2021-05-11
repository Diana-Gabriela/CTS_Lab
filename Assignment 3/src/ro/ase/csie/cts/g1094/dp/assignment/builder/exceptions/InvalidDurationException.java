package ro.ase.csie.cts.g1094.dp.assignment.builder.exceptions;

public class InvalidDurationException extends Exception {

	public InvalidDurationException() {
		super("Project can't have negative or less than 0 as duration");
	}
}
