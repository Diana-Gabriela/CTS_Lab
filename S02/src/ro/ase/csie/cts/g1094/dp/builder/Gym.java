package ro.ase.csie.cts.g1094.dp.builder;

import java.util.ArrayList;

public class Gym {

	String trainerName;
	String duration;
	DifficultyLevel difficulty;
	int nrParticipants;
	double price;
	String[] exercises;


	
	
	private Gym() {}




	public Gym(String trainerName, String duration, DifficultyLevel difficulty, int nrParticipants, double price,
			String excercise1, String excercise2, String excercise3, String excercise4) {
		super();
		this.trainerName = trainerName;
		this.duration = duration;
		this.difficulty = difficulty;
		this.nrParticipants = nrParticipants;
		this.price = price;
		this.exercises = new String[4];
		this.exercises[0] = excercise1;
		this.exercises[1] = excercise2;
		this.exercises[2] = excercise3;
		this.exercises[3] = excercise4;
	}


	public static class GymBuilder {
		
		Gym gymClass = null;
		
		public GymBuilder(String trainer, String duration) {
			
			this.gymClass = new Gym();
			this.gymClass.trainerName = trainer;
			this.gymClass.duration = duration;
			
		}
		
		public GymBuilder setDifficulty(DifficultyLevel difficulty){
            this.gymClass.difficulty = difficulty;
            return this;
        }

        public GymBuilder setMaxParticipants(int maxParticipants){
            this.gymClass.nrParticipants = maxParticipants;
            return this;
        }

        public GymBuilder setPrice(double price){
            this.gymClass.price = price;
            return this;
        }

        public GymBuilder setExercise1(String exercise){
            this.gymClass.exercises[0] = exercise;
            return this;
        }

        public GymBuilder setExercise2(String exercise){
            this.gymClass.exercises[1] = exercise;
            return this;
        }

        public GymBuilder setExercise3(String exercise){
            this.gymClass.exercises[2] = exercise;
            return this;
        }

        public GymBuilder setExercise4(String exercise){
            this.gymClass.exercises[3] = exercise;
            return this;
        }
        
        public Gym build(){
            return this.gymClass;
        }
	}
	
	
}
