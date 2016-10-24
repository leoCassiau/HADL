package m1.serveur;

import m2.connecteurs.Connecteur;

public class SecurityQuery extends Connecteur{

	public SecurityQuery(ServeurDetails c, RoleCalledSecurityQuery r1, RoleCallerSecurityQuery r2) {
		super(c, "SecurityQuery", r1, r2);
	}

}
