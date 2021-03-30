package ro.ase.csie.cts.g1092.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Tree3DModel tree1=new Tree3DModel("Green", 200);
		Tree3DModel tree2=new Tree3DModel("Red", 150);
		Tree3DModel tree3=new Tree3DModel("Green", 200);
		//shallowcopy
		//Tree3DModel tree4=tree1;
		
		//Tree3DModel tree5=(Tree3DModel) tree1.clone();
		
		Tree3DModel tree4=(Tree3DModel)tree1.clone();
		Tree3DModel tree5=(Tree3DModel)tree1.clone();
		Tree3DModel tree6=(Tree3DModel)tree1.clone();

		System.out.println("...the end");
		
	}

}
