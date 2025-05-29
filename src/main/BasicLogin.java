package main;

public class BasicLogin implements ILogin {
	private String name;
	private String password;
	
	public BasicLogin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return (this.name.equals(credential.getName()) && this.password.equals(credential.getKey()));
	}
}
