package m1.serveur;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementSecurityQueryDatabase extends Attachement{

	public AttachementSecurityQueryDatabase(SecurityManagement fournis, RoleCallerSecurityQuery requis) throws InterfaceException {
		super( "AttachementSecurityQueryDatabase", fournis, requis);
	}

}
