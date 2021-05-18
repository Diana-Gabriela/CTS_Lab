package ro.ase.csie.cts.g1094.dp.proxy;

public class TestProxy {

	public static void main(String[] args) {


		LoginInterface loginModule = new LoginModule("10.01.1", "users");
				
		if (loginModule.login("admin", "1234admin")) {
			System.out.println("hi admin");
		}
		else
		{
			System.out.println("Wrong credentials");
		}
		
		loginModule = new LoginWith2FactorAuth(loginModule);
		
		
		String[] passwords = new String[] {"1234", "admin", "admin1234", "1234admin"};
		for(String pass: passwords)
			if(loginModule.login("admin", pass)) {
				System.out.println("Cracked the password. It's : " + pass);
				break;
			}
		
				
	}

}
