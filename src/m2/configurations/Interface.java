package m2.configurations;

import m2.configurations.Configuration;

public abstract class Interface extends ComposantAbstrait {

	protected boolean fournis;

	public Interface(Configuration c, String nom, boolean fournis) {
		super(c, nom);
		this.fournis = fournis;
	}

	public boolean estFournis() {
		return fournis;
	}
	
	public boolean estRequis() {
		return !this.estFournis();
	}
}
