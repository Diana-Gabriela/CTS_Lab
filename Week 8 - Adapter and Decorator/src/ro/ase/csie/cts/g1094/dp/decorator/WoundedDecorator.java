package ro.ase.csie.cts.g1094.dp.decorator;

public class WoundedDecorator extends AbstractDecorator {

	
	
	public WoundedDecorator(SuperHeroCharacter decoratedObject) {
		super(decoratedObject);
	}

	@Override
	public void move() {
		
		System.out.println("Hero is barely moving...");
		//super.move();
	}

	
	
	
}
