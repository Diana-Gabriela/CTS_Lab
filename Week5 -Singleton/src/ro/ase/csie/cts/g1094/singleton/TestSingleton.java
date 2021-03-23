package ro.ase.csie.cts.g1094.singleton;

public class TestSingleton {

	public static void main(String[] args) {

		//DbConnection con1 =new DbConnection("125.00.123","game");
		
		//DbConnection con2 =new DbConnection();
		
		DbConnection con1 = DbConnection.getConnection();
		DbConnection con2 = DbConnection.getConnection();
		
		//DbConnection con1 = DbConnection.getConnection("127.0.0.1","cts");
		//DbConnection con2 = DbConnection.getConnection("127.0.0.1","cts");
		
		//DbConnection con3 = DbConnection.getConnection("10.0.0.1","production");

		
		if(con1==con2) {
			System.out.println("pointing to same database");
		}


	}

}
