package m1.simplecs;

import m2.composants.Port;

public class PortServeur extends Port{

	public PortServeur(SimpleCs c, boolean fournis) {
		super(c, "Receive Request", false);
	}

}
