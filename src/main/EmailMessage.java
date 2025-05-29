package main;

public class EmailMessage extends Message {

	public EmailMessage(ILogin emailLogin, String pengirim, String penerima, String message) {
		super(emailLogin, pengirim, penerima, message);
	}

	@Override
	public void send(String name, String password) {
		// TODO Auto-generated method stub
		if (iLogin.authenticate(new Credential(name, password))) {
			System.out.println("Email sent from " + pengirim + " to " + penerima + ": " + message);
		} else {
			System.out.println("Email authentication failed for user: " + name);
		}
		
	}

}
