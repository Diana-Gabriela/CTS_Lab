package cts.pacuraru.diana.g1094.composite;

import java.util.ArrayList;

public class AdminBloc extends CompositeAbstract {

	public AdminBloc(String nume) {
		
		this.nume = nume;
		
	}
	
	ArrayList<LocatarAbstract> ScariBloc = new ArrayList<>();
	
	@Override
	public void primesteMesajAdministratie(String mesaj, String numarBloc) {

		for ( LocatarAbstract p : ScariBloc) {
			p.primesteMesajAdministratie(mesaj, numarBloc);
			
		}
	}

	@Override
	public void platesteIntretinere(Double sumaDePlata) {

		for ( LocatarAbstract p : ScariBloc) {
			p.platesteIntretinere(sumaDePlata);
		}
	}
	
	public void raporteazaPrimarie (String mesaj) {
		
		System.out.println("Am raportat: " + mesaj);
		
	}
	
	@Override
	public void add(LocatarAbstract locatar) {
		
		this.ScariBloc.add(locatar);
	}

	@Override
	public void remove(LocatarAbstract presedinte) {
		
		this.ScariBloc.remove(presedinte);
	}

	@Override
	public LocatarAbstract get(int index) {
		return this.ScariBloc.get(index);
	}

}
