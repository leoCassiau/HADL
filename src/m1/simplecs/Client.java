package m1.simplecs;

import m2.composants.Composant;

public class Client extends Composant{

	
	public Client(SendRequest p) {
		super("client");
		this.add(p);
	}
	
	public void requete(String msg) {
		this.interfaces.get(0).notifyObservers(msg);
	}

}
