package ro.ase.csie.cts.g1094.singleton.registry;

public class TestRegistry {

	public static void main(String[] args) {

		
		DbConnection con1=DbConnection.getDbConnection("127.0.1", "devDb");
		DbConnection con2=DbConnection.getDbConnection("127.0.1", "devDb");
		DbConnection con3=DbConnection.getDbConnection("10.0.1", "temp");

		if(con1==con2) {
			System.out.println("pointing to the same location");
		}
		
		if(con1!=con3) {
			System.out.println("different dbs");
		}
		
	}

}
