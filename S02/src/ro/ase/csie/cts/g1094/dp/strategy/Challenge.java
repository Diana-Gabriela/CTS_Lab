package ro.ase.csie.cts.g1094.dp.strategy;

public class Challenge implements IChallenge {
	
	private static int nrRepetitii = 100;
	
	String name;
	
	IChallenge currentChallenge = null;
	
	
	public Challenge(String name) {
		super();
		this.name = name;
	}

	public void setCurrentChallenge(IChallenge currentChallenge) {
		this.currentChallenge = currentChallenge;
	}
	

	@Override
	public void startExercitiu(int nrRepetitii) {
		if(currentChallenge != null) {
			 this.currentChallenge.startExercitiu(nrRepetitii);
		}		
	}
	
	public void startExercitiu() {
		startExercitiu(nrRepetitii);
	}
	

}
