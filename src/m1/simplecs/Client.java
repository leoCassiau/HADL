package m1.simplecs;

import m2.composants.Composant;
import m2.outils.Requete;

public class Client extends Composant{

	
	public Client(SendRequest p) {
		super("client");
		this.add(p);
	}
	
	public void requete(String msg) {
		Requete requete = new Requete(msg, false);
		this.interfaces.get(0).notifyObservers(requete);
	}
	
	public void recevoir(Requete r){
		System.out.println("on a reçu le message du serveur : " + r.getMessage());
	}

}
