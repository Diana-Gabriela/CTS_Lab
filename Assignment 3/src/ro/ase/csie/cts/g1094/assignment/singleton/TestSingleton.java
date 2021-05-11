package ro.ase.csie.cts.g1094.assignment.singleton;

public class TestSingleton {

	public static void main(String[] args) {

		
		ProjectAnalyzer projectAnalyzer = ProjectAnalyzer.getProjectAnalyzer();
		ProjectAnalyzer projectAnalyzer2 = ProjectAnalyzer.getProjectAnalyzer();
		
		if(projectAnalyzer.getAlgorithm().equals(projectAnalyzer2.getAlgorithm())) {
			System.out.println("It is a singleton, we use the same algorithm for all instances.");
		}

		
	}

}
