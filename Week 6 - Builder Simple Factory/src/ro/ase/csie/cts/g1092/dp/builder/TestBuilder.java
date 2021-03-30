package ro.ase.csie.cts.g1092.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1.create
		//Superhero superHero= new Superhero();
		//2.init
		//TO DO: don't forget to initialize the obj with values
		
		Weapon pistol=new Weapon("Pistol");
		Superhero superhero= 
				new Superhero("Superman",100,false,false,pistol,null,"Fly","");
		Superhero superhero2= 
				new Superhero("Batman",100,false,false,null,null,"","");
		
		Superhero superman= 
				new Superhero.SuperheroBuilder("Superman", 100)
				.setLeftWeapon(pistol)
				.setSuperPower("fly")
				.setSuperSuperPower("laser eyes")
				.build();
		
		Superhero joker=
				new Superhero.SuperheroBuilder("Joker", 200)
				.isVillain()
				.setRightWeapon(pistol)
				.build();
		Superhero dummyHero=
				new Superhero.SuperheroBuilder("Dummy", 50).build();
		
	}

}
