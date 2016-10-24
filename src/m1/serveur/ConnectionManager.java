package m1.serveur;

import m2.composants.Composant;

public class ConnectionManager extends Composant{

	public ConnectionManager(ExternalSocket es, SecurityClock sc, DbQuery dbq) {
		super( "ConnectionManager");
		this.add(es);
		this.add(sc);
		this.add(dbq);
	}

}
