package cts.pacuraru.diana.g1094.composite;

public class Locatar extends LocatarAbstract {

	public Locatar(String nume) {
		this.nume = nume;
	}
	
	@Override
	public void primesteMesajAdministratie(String mesaj, String numarBloc) {
		System.out.println("Am primit mesaj: " + mesaj);
		
	}

	@Override
	public void platesteIntretinere(Double sumaDePlata) {
			System.out.println("Suma de plata: " + sumaDePlata);
	}

}
