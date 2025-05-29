package main;

public class SMSMessage extends Message {

	public SMSMessage(ILogin smsLogin, String pengirim, String penerima, String message) {
		super(smsLogin, pengirim, penerima, message);
	}

	@Override
	public void send(String name, String password) {
		// TODO Auto-generated method stub
		if(iLogin.authenticate(new Credential(name, password))) {
			System.out.println("SMS sent from " + pengirim + " to " + penerima + ": " + message);
		}else {
			System.out.println("SMS authentication failed for user: " + name);
		}
	}
	
}
