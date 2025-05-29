package main;

public class OAuthLogin implements ILogin {
	private String password;

	public OAuthLogin(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Boolean authenticate(Credential credential) {
		// TODO Auto-generated method stub
		return this.password.equals(credential.getKey());
	}
	
	
}
