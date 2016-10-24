package m1.simplecs;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementClientRpc extends Attachement{

	public AttachementClientRpc(SendRequest fournis, RoleCallerRpc requis) throws InterfaceException {
		super( "PortToRole", fournis, requis);
	}

}
