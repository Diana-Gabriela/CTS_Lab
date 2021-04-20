package ro.ase.csie.g1094.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TestFlyweight {

	public static void main(String[] args) {

    List<NPCCoordinates> soldiers = new ArrayList<>();
    soldiers.add(new NPCCoordinates(10,10,10,"red"));
    soldiers.add(new NPCCoordinates(10,10,10,"green"));
    soldiers.add(new NPCCoordinates(10,10,10,"yellow"));

    Model3DFlyweightInterface soldierModel= Model3DFactory.getModel(ModelType.SOLDIER);
    for(NPCCoordinates soldieCoordinates:soldiers) {
    	soldierModel.diplay(soldieCoordinates);
    }
    		
	}

}
