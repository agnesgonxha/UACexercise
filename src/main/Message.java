package main;


public abstract class Message {
	protected ILogin iLogin;
	protected String pengirim;
	protected String penerima;
	protected String message;
	
	public Message(ILogin iLogin, String pengirim, String penerima, String message) {
		this.iLogin = iLogin;
		this.pengirim = pengirim;
		this.penerima = penerima;
		this.message = message;
	}

	public abstract void send(String name, String password);
	
}
