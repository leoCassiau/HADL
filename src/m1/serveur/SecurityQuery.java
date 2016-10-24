package m1.serveur;

import m2.connecteurs.Connecteur;

public class SecurityQuery extends Connecteur{

	public SecurityQuery(RoleCalledSecurityQuery r1, RoleCallerSecurityQuery r2) {
		super( "SecurityQuery", r1, r2);
	}

}
