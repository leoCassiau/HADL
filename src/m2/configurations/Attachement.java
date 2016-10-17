package m2.configurations;

import m2.configurations.Configuration;
import m2.composants.Port;
import m2.connecteurs.Role;
import m2.outils.InterfaceException;

public class Attachement extends Lien {

	public Attachement(Configuration c, String nom, Port fournis, Role requis)
			throws InterfaceException {
		super(c, nom, fournis, requis);
	}
	
	public Attachement(Configuration c, String nom, Role fournis, Port requis)
			throws InterfaceException {
		super(c, nom, fournis, requis);
	}

}
