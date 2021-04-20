package ro.ase.csie.g1094.dp.composite;

public abstract class AbstractNode implements NPCActions{

	public abstract void addNode(AbstractNode node);
	public abstract void removeNode(AbstractNode node);
	public abstract AbstractNode getNode(int index);

}
