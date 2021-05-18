package cts.pacuraru.diana.g1094.pattern.chain;

public class Doctor extends MedicalServiceHandler {

	@Override
	public void processInjury(FisaAccident fisaAccident) {


		if(CheckInjuriesUtils.isMediumInjury(fisaAccident)) {
			System.out.println("I treated as a doctor the pacient " + fisaAccident.numePersoana);
		}
		else {
			if(this.next != null) {
				this.next.processInjury(fisaAccident);
			}
		}
		
	}

}
