package m1.simplecs;

import m2.connecteurs.Connecteur;

public class Rpc extends Connecteur{

	public Rpc(SimpleCs c, RoleCalledRpc r1, RoleCallerRpc r2) {
		super(c, "RPC", r1, r2);
	}

}
