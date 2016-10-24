package m1.serveur;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementDatabaseSQLRequest extends Attachement{

	public AttachementDatabaseSQLRequest(ServeurDetails c, RoleCalledSQLRequest fournis, QueryInt requis) throws InterfaceException {
		super(c, "AttachementDatabaseSQLRequest", fournis, requis);
	}



}
