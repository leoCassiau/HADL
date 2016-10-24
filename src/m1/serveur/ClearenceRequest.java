package m1.serveur;

import m2.connecteurs.Connecteur;

public class ClearenceRequest extends Connecteur{

	public ClearenceRequest(ServeurDetails c, RoleCalledClearenceRequest r1, RoleCallerClearenceRequest r2) {
		super(c, "ClerenceRequest", r1, r2);
	}

}
