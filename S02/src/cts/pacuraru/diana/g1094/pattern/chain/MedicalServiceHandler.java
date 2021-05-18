package cts.pacuraru.diana.g1094.pattern.chain;

public abstract class  MedicalServiceHandler {
	
	MedicalServiceHandler next = null;

	public void setNext(MedicalServiceHandler next) {
		this.next = next;
	}
	
	public abstract void processInjury(FisaAccident fisaAccident);

}
