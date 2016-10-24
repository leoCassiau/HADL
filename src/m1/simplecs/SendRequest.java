package m1.simplecs;

import m2.composants.Port;


public class SendRequest extends Port{

	public SendRequest(SimpleCs c) {
		super(c, "send_request", true);
	}

}
