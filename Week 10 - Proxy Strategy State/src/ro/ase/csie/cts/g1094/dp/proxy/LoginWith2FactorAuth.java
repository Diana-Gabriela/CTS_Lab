package ro.ase.csie.cts.g1094.dp.proxy;

public class LoginWith2FactorAuth implements LoginInterface{

	LoginInterface loginMoodule = null;
	
	
	
	public LoginWith2FactorAuth(LoginInterface loginMoodule) {
		super();
		this.loginMoodule = loginMoodule;
	}
	
	public boolean checkGeneratedCode(int code) {
		if(code ==1245) {
			return true;
		}
		else return false;
	}

	@Override
	public boolean login(String username, String pass) {

		if(this.loginMoodule.login(username, pass)) {
			System.out.println("Please check your phone for the code");
			System.out.println("Check code..");
			if(checkGeneratedCode(1234)) {
				System.out.println("Hi " + username);
				return true;
			}
			else System.out.println("Code incorrect. :(");

			
		}
		
		return false;
	}

	@Override
	public boolean checkServerStatus() {

		return this.loginMoodule.checkServerStatus();
	}

}
