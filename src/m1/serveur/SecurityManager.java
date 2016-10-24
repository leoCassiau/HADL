package m1.serveur;

import m2.composants.Composant;


public class SecurityManager extends Composant{

	public SecurityManager(ServeurDetails c, SecurityAuth sa, CQuery cq) {
		super(c, "SecurityManager");
		this.add(sa);
		this.add(cq);
	}

}
