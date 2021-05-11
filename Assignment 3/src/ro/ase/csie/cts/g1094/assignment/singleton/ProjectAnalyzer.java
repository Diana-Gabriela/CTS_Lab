package ro.ase.csie.cts.g1094.assignment.singleton;

public class ProjectAnalyzer {

	private String algorithm;
	private static ProjectAnalyzer singletonProject = null;
	
	
	private ProjectAnalyzer() {
		this.algorithm = "Bachelor Thesis Kisckstarter Algorithm";
		
	}
	
	public static ProjectAnalyzer getProjectAnalyzer() {
		if (singletonProject == null) {
			singletonProject = new ProjectAnalyzer();
			
		}
		return singletonProject;
	}

	public String getAlgorithm() {
		return algorithm;
	}
	
	
	
}
