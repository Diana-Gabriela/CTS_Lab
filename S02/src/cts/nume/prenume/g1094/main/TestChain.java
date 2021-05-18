package cts.nume.prenume.g1094.main;

import cts.pacuraru.diana.g1094.pattern.chain.Ambulance;
import cts.pacuraru.diana.g1094.pattern.chain.Doctor;
import cts.pacuraru.diana.g1094.pattern.chain.FisaAccident;
import cts.pacuraru.diana.g1094.pattern.chain.MedicalAssitant;
import cts.pacuraru.diana.g1094.pattern.chain.MedicalServiceHandler;
import cts.pacuraru.diana.g1094.pattern.chain.Trainer;

public class TestChain {

	public static void main(String[] args) {


		MedicalServiceHandler trainer = new Trainer();
		MedicalServiceHandler assistant = new MedicalAssitant();
		MedicalServiceHandler doctor = new Doctor();
		MedicalServiceHandler ambulance = new Ambulance();
		
		trainer.setNext(assistant);
		assistant.setNext(doctor);
		doctor.setNext(ambulance);
		FisaAccident notInjured = new FisaAccident("Joe", 10, true, true, false, false);
		
		trainer.processInjury(notInjured);
		
		FisaAccident seriousInjured = new FisaAccident("Doe", 10, true, false, true, true);

		trainer.processInjury(seriousInjured);
	}

}
