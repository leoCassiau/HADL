package m1.serveur;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementSecurityQueryDatabase extends Attachement{

	public AttachementSecurityQueryDatabase(ServeurDetails c, SecurityManagement fournis, RoleCallerSecurityQuery requis) throws InterfaceException {
		super(c, "AttachementSecurityQueryDatabase", fournis, requis);
	}

}
