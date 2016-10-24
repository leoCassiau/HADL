package m1.serveur;

import m2.composants.Port;

public class ExternalSocket extends Port{

	public ExternalSocket(ServeurDetails c) {
		super(c, "ExternalSocket", false);
	}

}
