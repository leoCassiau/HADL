package m1.serveur;

import m2.connecteurs.Connecteur;

public class SQLRequest extends Connecteur{

	public SQLRequest(RoleCalledSQLRequest r1, RoleCallerSQLRequest r2) {
		super( "SQLRequest", r1, r2);
	}

}
