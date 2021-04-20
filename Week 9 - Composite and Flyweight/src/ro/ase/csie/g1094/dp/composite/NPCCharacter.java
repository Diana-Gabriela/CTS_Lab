package ro.ase.csie.g1094.dp.composite;

public class NPCCharacter extends AbstractNode{

	String name;
	int power;
	
	
	public NPCCharacter(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	@Override
	public void attack(String playerName) {


		System.out.println(String.format("%s s attacking %s", name, playerName));
	}
	@Override

	public void retreat() {
		System.out.println(String.format("%s is retreating from the fight", name));
		
	}
	@Override

	public void move() {
		System.out.println(String.format("%s is on the move", name));
		
	}
	@Override

	public void addNode(AbstractNode node) {
		
		throw new UnsupportedOperationException();		
	}
	@Override

	public void removeNode(AbstractNode node) {
		throw new UnsupportedOperationException();		
		
	}
	@Override

	public AbstractNode getNode(int index) {
		throw new UnsupportedOperationException();		
	}

}
