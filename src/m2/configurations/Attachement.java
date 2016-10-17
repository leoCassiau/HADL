package m2.configurations;

import m2.composants.Port;
import m2.connecteurs.Role;
import m2.outils.InterfaceException;

public class Attachement extends Lien {

	public Attachement(String nom, Port fournis, Role requis)
			throws InterfaceException {
		super(nom, fournis, requis);
	}
	
	public Attachement(String nom, Role fournis, Port requis)
			throws InterfaceException {
		super(nom, fournis, requis);
	}

}
