package m1.serveur;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementDatabaseSQLRequest extends Attachement{

	public AttachementDatabaseSQLRequest(RoleCalledSQLRequest fournis, QueryInt requis) throws InterfaceException {
		super( "AttachementDatabaseSQLRequest", fournis, requis);
	}



}
