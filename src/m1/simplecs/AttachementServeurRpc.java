package m1.simplecs;

import m1.serveur.ReceiveRequestRequis;
import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementServeurRpc extends Attachement{

	public AttachementServeurRpc(SimpleCs c, RoleCalledRpc fournis, ReceiveRequestRequis requis) throws InterfaceException {
		super(c, "RoleToPort", fournis, requis);
	}

}
