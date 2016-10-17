package m1.simplecs;

import m2.composants.Port;


public class PortClient extends Port{

	public PortClient(SimpleCs c) {
		super(c, "send_request", true);
	}

}
