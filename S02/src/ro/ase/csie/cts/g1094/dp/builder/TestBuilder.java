package ro.ase.csie.cts.g1094.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {


		Gym class1 = new Gym.GymBuilder("Joe", "a life")
				.setDifficulty(DifficultyLevel.ADVANCED)
				.setExercise1("jump")
				.setExercise2("punch")
				.setExercise3("kick")
				.setMaxParticipants(3)
				.setPrice(20)
				.build();
		
		
		Gym class2 = new Gym.GymBuilder("Doe", "2 life")
				.setDifficulty(DifficultyLevel.ADVANCED)
				.setExercise1("cry")
				.setExercise2("roll")
				.setExercise3("over")
				.build();
		
		
		Gym class3 = new Gym.GymBuilder("Boe", "3 life")
				.setDifficulty(DifficultyLevel.BEGGINER)
				.setExercise1("cry")
				.build();

		Gym class4 = new Gym.GymBuilder("Moe", "5 life")
				.setDifficulty(DifficultyLevel.BEGGINER)
				.setExercise1("cry")
				.setPrice(2000)
				.setMaxParticipants(33)
				.build();
	}

}
