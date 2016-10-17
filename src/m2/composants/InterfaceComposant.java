package m2.composants;

import m2.configurations.Configuration;
import m2.configurations.Interface;

public abstract class InterfaceComposant extends Interface {

	public InterfaceComposant(Configuration c, String nom, boolean fournis) {
		super(c, nom, fournis);
	}

}
