package m1.binding;

import m1.serveur.ReceiveRequestRequis;
import m1.simplecs.ReceiveRequestFournis;
import m2.configurations.Binding;
import m2.configurations.Configuration;
import m2.outils.InterfaceException;

public class BindingServeur extends Binding{

	public BindingServeur(Configuration c, ReceiveRequestFournis fournis, ReceiveRequestRequis requis) throws InterfaceException {
		super(c, "BindingServeur", fournis, requis);
	}

}
