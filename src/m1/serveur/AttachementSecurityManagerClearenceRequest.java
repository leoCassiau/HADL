package m1.serveur;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementSecurityManagerClearenceRequest extends Attachement{

	public AttachementSecurityManagerClearenceRequest(RoleCalledClearenceRequest fournis, SecurityAuth requis) throws InterfaceException {
		super( "AttachementSecurityManagerClerenceRequest", fournis, requis);
	}

}
