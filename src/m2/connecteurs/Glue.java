package m2.connecteurs;

import m2.configurations.Configuration;
import m2.configurations.Lien;
import m2.outils.InterfaceException;

public class Glue extends Lien {

	public Glue(Configuration c, String nom, Role fournis, Role requis) throws InterfaceException {
		super(c, nom, fournis, requis);
	}
	
	public Object coller(Object args) {
		return null;
	}
}
