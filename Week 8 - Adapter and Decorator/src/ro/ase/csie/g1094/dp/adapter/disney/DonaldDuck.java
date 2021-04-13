package ro.ase.csie.g1094.dp.adapter.disney;

public class DonaldDuck implements DisneyActions{

	String name;
	int lifePoints;
	
	
	public DonaldDuck( int lifePoints) {
		super();
		this.lifePoints = lifePoints;
	}

	@Override
	public void changeLocation(int x, int y) {
		System.out.println("Moving to a new location");
	}

	@Override
	public void isWounded(int lostLifePoints) {


		System.out.println(String.format("%s lost %d points",name,lostLifePoints));
	}

	@Override
	public void isHealing(int recoveredPoints) {

		System.out.println(String.format("%s recovered %d points",name,recoveredPoints));

		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return this.lifePoints;
	}

	
	
}
