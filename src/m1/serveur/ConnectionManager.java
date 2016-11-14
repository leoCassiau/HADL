package m1.serveur;

import m2.composants.Composant;
import m2.outils.Requete;

public class ConnectionManager extends Composant{

	public ConnectionManager(ExternalSocket es, SecurityClock sc, DbQuery dbq) {
		super( "ConnectionManager");
		this.add(es);
		this.add(sc);
		this.add(dbq);
	}

	public DbQuery getDbQuery() {
		return (DbQuery) this.getInterfaces().get(2);
	}
	
	public SecurityClock getSecurityClock() {
		return (SecurityClock) this.getInterfaces().get(1);
	}
	
	public ExternalSocket getExternalSocket() {
		return (ExternalSocket) this.getInterfaces().get(0);
	}
	
	public Requete recevoir(Requete r){
		return r;
	}
}
