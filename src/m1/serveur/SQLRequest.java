package m1.serveur;

import m2.connecteurs.Connecteur;

public class SQLRequest extends Connecteur{

	public SQLRequest(ServeurDetails c, RoleCalledSQLRequest r1, RoleCallerSQLRequest r2) {
		super(c, "SQLRequest", r1, r2);
	}

}
