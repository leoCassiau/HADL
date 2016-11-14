package m1.simplecs;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementServeurRpc extends Attachement{

	public AttachementServeurRpc(ReceiveRequestFournis fournis, RoleCalledRpc requis)  throws InterfaceException {
		super( "RoleToPort", fournis, requis);
	}

}
