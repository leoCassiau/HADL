package m1.simplecs;

import m2.composants.Composant;

public class Serveur extends Composant{

	public Serveur(SimpleCs c, ReceiveRequestFournis p) {
		super(c, "serveur");
		this.add(p);
	}

}
