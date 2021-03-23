package ro.ase.csie.cts.g1094.singleton.ennumeration;

public enum DbConnection {

	DEV_DB;
	
	
	String connString;
	String schema;
	
	private DbConnection() {
		System.out.println("Loading settings from configuration file..");
		
	}
	
	
	
}
