package m1.serveur;

import m2.composants.Composant;
import m2.outils.Requete;

public class Database extends Composant{

	public Database(SecurityManagement sm, QueryInt qi) {
		super( "Database");
		this.add(sm);
		this.add(qi);
	}

	public SecurityManagement getSecurityManagement() {
		return (SecurityManagement) this.getInterfaces().get(0);
	}

	public QueryInt getQueryInt() {
		return (QueryInt) this.getInterfaces().get(1);
	}
	
	public Requete recevoir(Requete r){
		r.setToken(true);
		r.setMessage("au revoir");
		return r;
	}
}
