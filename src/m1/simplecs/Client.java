package m1.simplecs;

import m2.composants.Composant;

public class Client extends Composant{

	
	public Client(SimpleCs c, SendRequest p) {
		super(c,"client");
		this.add(p);
	}

}
