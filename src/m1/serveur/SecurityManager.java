package m1.serveur;

import m2.composants.Composant;
import m2.outils.Requete;


public class SecurityManager extends Composant{

	public SecurityManager(SecurityAuth sa, CQuery cq) {
		super( "SecurityManager");
		this.add(sa);
		this.add(cq);
	}

	public CQuery getCQuery() {
		return (CQuery) this.getInterfaces().get(1);
	}
	
	public Requete recevoir(Requete r){
		r.setMessage(r.getMessage()+" (safe)");
		return r;
	}
}
