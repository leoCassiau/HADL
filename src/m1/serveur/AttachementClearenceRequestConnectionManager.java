package m1.serveur;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementClearenceRequestConnectionManager extends Attachement{

	public AttachementClearenceRequestConnectionManager(ServeurDetails c, SecurityClock fournis, RoleCallerClearenceRequest requis) throws InterfaceException {
		super(c, "AttachementClerenceRequestConnectionManager", fournis, requis);
	}

}
