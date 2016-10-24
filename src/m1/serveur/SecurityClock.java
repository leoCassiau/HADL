package m1.serveur;

import m2.composants.Port;

public class SecurityClock extends Port{

	public SecurityClock(ServeurDetails c) {
		super(c, "SecurityClock", true);
	}

}
