package cts.pacuraru.diana.g1094.pattern.chain;

public class Trainer extends MedicalServiceHandler {

	@Override
	public void processInjury(FisaAccident fisaAccident) {

		if(CheckInjuriesUtils.isInjured(fisaAccident)){
			if(this.next != null) {
				this.next.processInjury(fisaAccident);
			}
		}
		else {
			System.out.println(fisaAccident.numePersoana + " is not injured");
		}

		
		
	}

}
