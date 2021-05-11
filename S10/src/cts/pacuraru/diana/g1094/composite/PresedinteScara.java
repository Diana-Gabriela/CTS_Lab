package cts.pacuraru.diana.g1094.composite;

import java.util.ArrayList;

public class PresedinteScara extends CompositeAbstract{

	
	public PresedinteScara(String nume) {
		
		this.nume = nume;
	}
	
	ArrayList<LocatarAbstract> locatari = new ArrayList<>(); 
	
	
	
	@Override
	public void primesteMesajAdministratie(String mesaj, String numarBloc) {
		for (LocatarAbstract l : locatari) {
			l.primesteMesajAdministratie(mesaj, numarBloc);
			
			
		}
		System.out.println("Predintele scarii a primit mesajul");
	}

	@Override
	public void platesteIntretinere(Double sumaDePlata) {

		for ( LocatarAbstract l : locatari) {
			l.platesteIntretinere(sumaDePlata);
		}
		
	}
	
	@Override
	public void add(LocatarAbstract locatar) {
		if (locatar instanceof Locatar) {
		this.locatari.add(locatar);
		} else {
			throw new UnsupportedOperationException("Gestionam doar locatari.");
		}
	}
	
	@Override
	public void remove(LocatarAbstract locatar) {
		
		this.locatari.remove(locatar);
	}
	
	
	@Override
	public LocatarAbstract get(int index) {
		return this.locatari.get(index);
	}

}
