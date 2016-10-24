package m1.simplecs;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementClientRpc extends Attachement{

	public AttachementClientRpc(SimpleCs c, SendRequest fournis, RoleCallerRpc requis) throws InterfaceException {
		super(c, "PortToRole", fournis, requis);
	}

}
