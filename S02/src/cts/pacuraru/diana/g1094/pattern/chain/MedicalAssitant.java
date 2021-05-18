package cts.pacuraru.diana.g1094.pattern.chain;

public class MedicalAssitant extends MedicalServiceHandler {

	@Override
	public void processInjury(FisaAccident fisaAccident) {


		if(CheckInjuriesUtils.isLightInjury(fisaAccident)) {
			System.out.println("I treated the pacient " + fisaAccident.numePersoana);
		}
		else {
			if(next != null) {
				this.next.processInjury(fisaAccident);
			}
		}
	}

}
