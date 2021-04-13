package ro.ase.csie.cts.g1094.dp.decorator;


public class TestDecorator {

	public static void main(String[] args) {
		SuperHeroCharacter fantasyHero=
				new FantasySuperHero("Blue dragon", 1000, true);
		fantasyHero.move();
		
		
		fantasyHero.takeAHit(500);
		
		//dragon should look and behave wounded
		WoundedDecorator woundedHero=
				new WoundedDecorator(fantasyHero);
		woundedHero.move();
		
		
		fantasyHero.heal(200);
		//add shield
		
		SuperHeroCharacter heroWithShield= new ShieldDecorator(fantasyHero, 200);
		heroWithShield.takeAHit(500);
		
		SuperHeroCharacter woundedHeroWithShield= 
				new ShieldDecorator(woundedHero, 250);
		woundedHeroWithShield.move();
		woundedHeroWithShield.takeAHit(260);
		
	}

}
