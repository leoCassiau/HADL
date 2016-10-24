package m1.serveur;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementSQLRequestConnectionManager extends Attachement{

	public AttachementSQLRequestConnectionManager(DbQuery fournis, RoleCallerSQLRequest requis) throws InterfaceException {
		super( "AttachementSQLRequestConnectionManager", fournis, requis);
	}

}
