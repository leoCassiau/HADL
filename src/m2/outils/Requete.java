package m2.outils;


public class Requete {

	
	private String message;
	private boolean token;
	
	
	public Requete(String message, boolean token) {
		super();
		this.message = message;
		this.token = token;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public boolean isToken() {
		return token;
	}


	public void setToken(boolean token) {
		this.token = token;
	}
	
	
	
	
}
