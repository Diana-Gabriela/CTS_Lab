package ro.ase.csie.cts.g1094.dp.chain;

public abstract class InjuryHandler {

	InjuryHandler next = null;
	
	public void setNext(InjuryHandler next) {
		this.next = next;
		
	}
	
	public abstract void assesInjury(Injury injury);
	
}
