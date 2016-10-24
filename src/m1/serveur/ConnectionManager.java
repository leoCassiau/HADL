package m1.serveur;

import m2.composants.Composant;

public class ConnectionManager extends Composant{

	public ConnectionManager(ServeurDetails c, ExternalSocket es, SecurityClock sc, DbQuery dbq) {
		super(c, "ConnectionManager");
		this.add(es);
		this.add(sc);
		this.add(dbq);
	}

}
