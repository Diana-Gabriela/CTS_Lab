package ro.ase.csie.cts.g1094.dp.assignment.builder;

import ro.ase.csie.cts.g1094.dp.assignment.builder.exceptions.CountryNotFoundException;
import ro.ase.csie.cts.g1094.dp.assignment.builder.exceptions.InvalidDurationException;

public class ProjectData {
	
	private String name;
	private int duration;
	private Countries country;
	private double goalUSD;
	
	public ProjectData() {};
	
	public ProjectData(String name, int duration, Countries country, double goalUSD) {
		super();
		this.name = name;
		this.duration = duration;
		this.country = country;
		this.goalUSD = goalUSD;
	}

	public String getName() {
		return name;
	}


	public int getDuration() {
		return duration;
	}



	public Countries getCountry() {
		return country;
	}



	public double getGoalUSD() {
		return goalUSD;
	}

	

	public static class ProjectDataBuilder {

		ProjectData projectData = null;
		
		public ProjectDataBuilder (final String name,final int goalUSD) {
			
			this.projectData= new ProjectData();
			this.projectData.name = name;
			this.projectData.goalUSD = goalUSD;
			
		}
		
		public ProjectDataBuilder setCountry(String country) throws CountryNotFoundException {
			
			boolean isAvailable = false;
			for (Countries c : Countries.values()) {
				if (c.toString().equalsIgnoreCase(country)) {
					this.projectData.country = c;
					isAvailable = true;
					break;
				}
			}
			
			if (!isAvailable) {
				throw new CountryNotFoundException(country);
			
			}	
			return this;
		}
		
		public ProjectDataBuilder setDuration (int duration) throws InvalidDurationException {
			
			if(duration <= 0 ) {
				throw new InvalidDurationException();
			}
			this.projectData.duration = duration;
			return this;
		}
		
		ProjectData build() {
			
			return this.projectData;
		}
	}
	
	

	
	

}
