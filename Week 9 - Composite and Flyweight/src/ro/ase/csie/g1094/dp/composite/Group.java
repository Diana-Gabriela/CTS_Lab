package ro.ase.csie.g1094.dp.composite;

import java.util.ArrayList;

public class Group extends AbstractNode{

	String groupName;
	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	ArrayList<AbstractNode> nodes = new ArrayList<>();

	@Override
	public void attack(String playerName) {
		for (AbstractNode node :nodes) {
			node.attack(playerName);
		}
	}

	@Override
	public void retreat() {
		for (AbstractNode node :nodes) {
			node.retreat();}
		
	}

	@Override
	public void move() {

		throw new UnsupportedOperationException();
	}

	@Override
	public void addNode(AbstractNode node) {

		this.nodes.add(node);
	}

	@Override
	public void removeNode(AbstractNode node) {

		this.nodes.remove(node);
	}

	@Override
	public AbstractNode getNode(int index) {

		return this.nodes.get(index);
	}
	
}
