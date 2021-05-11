package ro.ase.csie.cts.g1094.dp.assignment.builder;

import ro.ase.csie.cts.g1094.dp.assignment.builder.exceptions.CountryNotFoundException;
import ro.ase.csie.cts.g1094.dp.assignment.builder.exceptions.InvalidDurationException;

public class TestBuilder {

	public static void main(String[] args) {

		try {
		ProjectData projectData1 = new ProjectData.ProjectDataBuilder("Game", 1000)
				.setCountry("US")
				.setDuration(30)
				.build();

		} catch(InvalidDurationException | CountryNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		
		try {

			ProjectData projectData2 = new ProjectData.ProjectDataBuilder("Comic", 20)
					.setCountry("FR")
					.setDuration(0)
					.build();
		} catch(InvalidDurationException | CountryNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		
		try {

			ProjectData projectData3 = new ProjectData.ProjectDataBuilder("Cupcake", 200)
					.setCountry("USD")
					.setDuration(10)
					.build();
		} catch(InvalidDurationException | CountryNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
