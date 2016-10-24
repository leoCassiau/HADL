package m1.simplecs;

import m2.composants.Composant;

public class Serveur extends Composant{

	public Serveur(ReceiveRequestFournis p) {
		super( "serveur");
		this.add(p);
	}

}
