package m1.binding;

import m1.serveur.ExternalSocket;
import m1.serveur.ReceiveRequestRequis;
import m2.configurations.Binding;
import m2.outils.InterfaceException;

public class BindingServerDetails extends Binding{

	public BindingServerDetails(ExternalSocket fournis, ReceiveRequestRequis requis) throws InterfaceException {
		super("BindingServerDetails", fournis, requis);
	}

}