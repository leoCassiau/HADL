package m1.serveur;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementClearenceRequestConnectionManager extends Attachement{

	public AttachementClearenceRequestConnectionManager(SecurityClock fournis, RoleCallerClearenceRequest requis) throws InterfaceException {
		super( "AttachementClerenceRequestConnectionManager", fournis, requis);
	}

}
