package cts.pacuraru.diana.g1094.main;

import cts.pacuraru.diana.g1094.composite.AdminBloc;
import cts.pacuraru.diana.g1094.composite.CompositeAbstract;
import cts.pacuraru.diana.g1094.composite.Locatar;
import cts.pacuraru.diana.g1094.composite.LocatarAbstract;
import cts.pacuraru.diana.g1094.composite.PresedinteScara;

public class TestComposite {

	public static void main(String[] args) {

		CompositeAbstract presedinteScara1 = new PresedinteScara("Ion");
		
		CompositeAbstract presedinteScara2 = new PresedinteScara("Maria");
		
		presedinteScara1.add(new Locatar("Gigel"));
		presedinteScara1.add(new Locatar("Iancu"));
		presedinteScara1.add(new Locatar("Marin"));

		presedinteScara2.add(new Locatar("Ana"));
		presedinteScara2.add(new Locatar("Ioana"));
		presedinteScara2.add(new Locatar("Catalina"));

		
		CompositeAbstract admin1 = new AdminBloc("Cristian");
		admin1.add(presedinteScara1);
		admin1.add(presedinteScara2);
		
		admin1.primesteMesajAdministratie("NU avem apa calda!!", "B2");
		admin1.platesteIntretinere(201.0);
		
		
		
	}

}
