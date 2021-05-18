package ro.ase.csie.cts.g1094.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {



		Challenge summerChallenge = new Challenge("Summer");
		Challenge winterChallenge = new Challenge("Winter");

		
		summerChallenge.setCurrentChallenge(new JumpingJacks());
		summerChallenge.startExercitiu();
		
		
		summerChallenge.setCurrentChallenge(new Crunches());
		summerChallenge.startExercitiu();
		
		summerChallenge.setCurrentChallenge(new PushUps());
		summerChallenge.startExercitiu();
		
		winterChallenge.setCurrentChallenge(new PushUps());
		winterChallenge.startExercitiu();
	}

}
