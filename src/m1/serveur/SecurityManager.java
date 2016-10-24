package m1.serveur;

import m2.composants.Composant;


public class SecurityManager extends Composant{

	public SecurityManager(SecurityAuth sa, CQuery cq) {
		super( "SecurityManager");
		this.add(sa);
		this.add(cq);
	}

}
