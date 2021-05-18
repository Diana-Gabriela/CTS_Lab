package cts.pacuraru.diana.g1094.pattern.chain;

public class Ambulance extends MedicalServiceHandler{

	@Override
	public void processInjury(FisaAccident fisaAccident) {

		if(CheckInjuriesUtils.isSeriousInjury(fisaAccident)) {
			
			
			System.out.println("We took him to the hospital");	
		}	else {
				if(this.next != null) {
					this.next.processInjury(fisaAccident);
				}
		}
			
	}
	
	

}
