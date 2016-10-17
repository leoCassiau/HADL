package m2.configurations;

import m2.configurations.Configuration;
import m2.composants.Port;
import m2.outils.InterfaceException;

public class Binding extends Lien {

	public Binding(Configuration c, String nom, Port fournis, Port requis)
			throws InterfaceException {
		super(c, nom, fournis, requis);
	}

	
}
