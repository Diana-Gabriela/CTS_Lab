package ro.ase.csie.cts.g1094.dp.state;

public class TestState {

	public static void main(String[] args) {


		Superhero superman = new Superhero("Superman", 500);
		
		superman.move();
		
		superman.takeAHit(350);
		superman.move();
		
		superman.takeAHit(100);
		superman.move();
		
		superman.heal(500);
		superman.move();
		
	}

}
