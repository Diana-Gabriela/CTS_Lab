package ro.ase.csie.cts.g1094.singleton.staticref;


public class DbConnection {

	String connString;
	String schema;
	
	//eager instantiation
	public final  static DbConnection connection= new DbConnection();
	
	
	//static class initialiser
	static{
		//called only once before the class is loaded by the JVM
		System.out.println("Good day. DbConnection is loaded");
		connection.connString="10.0.01";
		connection.schema="tempData";
	}
	
	//constructor initialiser
	{
		
		//called every time before any constructor call
		System.out.println("Building an object..");
		
	}
	
	//define this, otherwise yu get the public one and that is wrong and misleading
	private DbConnection() {
			System.out.println("Creating a connection..");
			System.out.println("Loading configuration..");
			this.connString="127.0.0.1";
			this.schema="cts";

	}

	
	
}