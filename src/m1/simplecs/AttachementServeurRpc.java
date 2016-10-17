package m1.simplecs;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementServeurRpc extends Attachement{

	public AttachementServeurRpc(SimpleCs c, RoleCalledRpc fournis, PortServeur requis) throws InterfaceException {
		super(c, "RoleToPort", fournis, requis);
	}

}
