package ro.ase.csie.cts.g1094.dp.memento;

public class TestMemento {

	public static void main(String[] args) {


		SuperHero superman = new SuperHero("Superman", 500, "Fly");
		
		SuperHeroMemento autosave1 = superman.save();
		
		superman.name = "Batman";
		System.out.println(superman.name);
		
		
	}

}