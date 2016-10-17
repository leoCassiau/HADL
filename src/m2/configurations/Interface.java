package m2.configurations;


public abstract class Interface extends ComposantAbstrait {

	protected boolean fournis;

	public Interface(String nom, boolean fournis) {
		super(nom);
		this.fournis = fournis;
	}

	public boolean estFournis() {
		return fournis;
	}
	
	public boolean estRequis() {
		return !this.estFournis();
	}
}
